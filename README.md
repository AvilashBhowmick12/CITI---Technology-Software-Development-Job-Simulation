# CITI---Technology-Software-Development-Job-Simulation

This repository contains the source code and documentation for a stock market analysis tool built as part of the Citi internship tasks. The project is divided into four main tasks:

- **Task 01**: UML Diagram for Loan Management System
- **Task 02**: Query Stock Data from the Web
- **Task 03**: Java Application for Stock Monitoring
- **Task 04**: Live Stock Data Visualization with JavaFX

---

## Task 01: UML Diagram for Loan Management System

### Description
In this task, we created a **UML State Diagram** representing the loan management process at Citi. This diagram helps in visualizing the loan workflow, from the initial loan application through review, approval/rejection, disbursement, and loan closure.

### Contents
- **State Diagram**: The diagram outlines the states of the loan lifecycle, including transitions such as approval, rejection, payment, and default.
- **Tools Used**: 
  - PlantUML for generating the UML state diagram.
  - Diagrams.net for diagram editing.

### Steps to View
1. You can view the diagram generated using PlantUML in the `/diagrams` directory.
2. The `.puml` file contains the PlantUML code to regenerate the state diagram.

---

## Task 02: Report on Querying Data from the Web

### Description
In this task, we built a Java application that queries real-time stock data using the **Yahoo Finance API**. The task also involved preparing a report on credit risk modeling using machine learning, focusing on predicting the likelihood of loan default.

### Contents
- **Java Application**: The application uses the Yahoo Finance API to query stock data, specifically targeting the **Dow Jones Industrial Average (DJIA)**. The stock data is fetched and stored in a queue with timestamps.
- **Report on Credit Risk**: The report includes an analysis of how machine learning can be applied to credit risk prediction. It outlines the key data inputs, outputs, and the model architecture for a potential credit risk modeling system.

### Steps to Run
1. Clone the repository using:
   ```bash
   git clone https://github.com/AvilashBhowmick12/Citi-Stock-Market-Analysis-Tool-Task-03.git
2. Install the dependencies listed in the `build.gradle` file (Yahoo Finance API).
Run the Java application using:
    ```bash
    gradle run

---

## Task 03: Java Stock Predictor and Analyzer

### Description

This task involved building a Java-based stock monitoring tool that queries the Dow Jones Industrial Average (DJIA) stock price every five seconds and stores it in a queue. The application displays the queried stock data in the terminal, providing employees with real-time information.

### Features
- Stock Query: Queries the DJIA stock price every five seconds using the Yahoo Finance API.
- Queue Storage: Stores the stock value along with a timestamp in a queue for future reference.
- Scheduled Query: Uses `ScheduledExecutorService` to automatically fetch data at regular intervals.

### Steps to Run
1. Open the repository in VSCode and run:
    ```bash
    gradle run
2. The stock price and timestamps will be printed in the console every 5 seconds.

---


## Task 04: Live Stock Data Visualization
### Description

This task extends the Java stock predictor tool by adding a real-time visual dashboard using JavaFX. The application displays a live-updating line chart with time on the X-axis and stock price on the Y-axis. The chart updates every five seconds as new data is queried from Yahoo Finance.

### Features
- **Live Chart:** A line graph that displays the stock price over time with real-time updates.
- **JavaFX Integration:** The application uses JavaFX to create a visually appealing and interactive UI.
- **Real-Time Updates:** The chart refreshes every five seconds as the application fetches new stock prices.

### Steps to Run
1. Install JavaFX dependencies by updating the `build.gradle` file with:
groovy : 
    ```bash
    implementation 'org.openjfx:javafx-controls:17'
    implementation 'org.openjfx:javafx-fxml:17'
2. Compile and run the application:
    ```bash
    gradle build
    gradle run
3. A window will open, displaying a real-time line chart of DJIA stock prices.
Repository Structure

---

```bash
project-root/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   └── java/
│   │   │       └── project_name/
│   │   │           ├── App.java  # Main Java file for stock monitoring and visualization
│   │   └── test/
│   │       └── java/
│   │           └── AppTest.java  # Placeholder for tests
├── diagrams/
│   └── loan-management-uml.puml  # UML diagram for loan management system
├── reports/
│   └── credit-risk-report.pdf  # Credit risk modeling report
├── build.gradle
├── README.md
└── settings.gradle
```

## Technologies Used

- **Java:** Core language for application logic.
- **Gradle:** Build tool for managing dependencies and running the application.
- **Yahoo Finance API:** Used to fetch live stock data.
- **JavaFX:** For creating a real-time stock price line chart visualization.
- **PlantUML:** For generating UML diagrams.
- **JUnit:** Used for testing the Java application.

---

## Future Improvements

- Multiple Stock Symbols: Add support for tracking multiple stocks in parallel.
- Historical Data: Allow employees to view historical stock data (hourly, daily, monthly).
- Advanced Visualization: Extend the line chart to include more granular data like volume, price fluctuations, and moving averages.
- Database Integration: Store the fetched stock data in a database for persistence and analysis.

---


#Certificate

A certificate of completion for this project will be attached here:
[https://forage-uploads-prod.s3.amazonaws.com/completion-certificates/Citi/2jxESPvorR7fmypXj_Citi_tnsQDn6xxhD7xrmvX_1726844685583_completion_certificate.pdf]

---

### Explanation:
- The **README.md** file is organized based on tasks.
- Each task includes descriptions, features, steps to run, and highlights of what was done.
- There is a **repository structure** section that maps the file layout.
- The **Technologies Used** and **Future Improvements** sections outline the current stack and possibilities for future work.
- The **certificate section** is included for future attachment.
