import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.text.SimpleDateFormat;

public class App extends Application {
    
    // Stock symbol (Dow Jones Industrial Average)
    private static final String STOCK_SYMBOL = "^DJI";
    
    // Queue to hold stock price and timestamp data
    private static final Deque<String> stockDataQueue = new ArrayDeque<>();
    
    // Series to store data points for the line chart
    private XYChart.Series<String, Number> series = new XYChart.Series<>();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Real-Time DJIA Stock Price Monitoring");

        // Define X and Y axes
        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Stock Price");

        NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("Time");

        // Create the line chart
        LineChart<String, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Dow Jones Industrial Average (Live Data)");

        // Add the series to the chart
        series.setName("Stock Price Over Time");
        lineChart.getData().add(series);

        // Create a layout and scene
        VBox vbox = new VBox(lineChart);
        Scene scene = new Scene(vbox, 800, 600);
        
        primaryStage.setScene(scene);
        primaryStage.show();

        // Start fetching stock data every 5 seconds
        fetchStockData();
    }

    // Method to fetch stock data from Yahoo Finance and update the chart
    private void fetchStockData() {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

        // Schedule a task to fetch stock data every 5 seconds
        executorService.scheduleAtFixedRate(() -> {
            try {
                // Query Yahoo Finance for the stock data
                Stock stock = YahooFinance.get(STOCK_SYMBOL);
                double price = stock.getQuote().getPrice().doubleValue();

                // Format the timestamp
                SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
                String time = formatter.format(new Date());

                // Store stock value and timestamp in the queue
                stockDataQueue.offer("Time: " + time + ", Price: " + price);

                // Update the chart with the new data point
                javafx.application.Platform.runLater(() -> {
                    series.getData().add(new XYChart.Data<>(time, price));

                    // Limit the number of data points displayed
                    if (series.getData().size() > 20) {
                        series.getData().remove(0);
                    }
                });

                System.out.println("Time: " + time + ", Price: " + price);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, 0, 5, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
