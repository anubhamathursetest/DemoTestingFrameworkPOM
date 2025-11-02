# Demo Testing Framework POM

## Overview
This project is a Demo Testing Framework built using Selenium WebDriver, TestNG, and Extent Reports. It aims to automate the end-to-end ticket booking flow for a movie booking application, focusing on stabilizing regression, improving test coverage, and reducing manual effort.

## Project Structure
```
DemoTestingFrameworkPOM
├── .github
│   └── workflows
│       └── ci.yml          # GitHub Actions configuration for CI/CD
├── pom.xml                 # Maven configuration file
├── testng.xml              # TestNG configuration file
├── README.md                # Project documentation
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           ├── pages
│   │   │           │   ├── HomePage.java
│   │   │           │   ├── MoviePage.java
│   │   │           │   ├── SeatPage.java
│   │   │           │   └── PaymentPage.java
│   │   │           └── utils
│   │   │               ├── DriverFactory.java
│   │   │               ├── ConfigReader.java
│   │   │               ├── WaitUtils.java
│   │   │               └── ExtentManager.java
│   │   └── resources
│   │       ├── config.properties
│   │       └── extent-config.xml
│   └── test
│       ├── java
│       │   └── com
│       │       └── example
│       │           └── tests
│       │               ├── TC_01_LocationSelectionTest.java
│       │               ├── TC_02_MovieSelectionTest.java
│       │               ├── TC_03_ViewMoviesTest.java
│       │               ├── TC_04_SmokeSuite.java
│       │               ├── TC_05_TheatreSelectionTest.java
│       │               ├── TC_06_SeatSelectionTest.java
│       │               ├── TC_07_SeatLayoutValidationTest.java
│       │               ├── TC_08_SeatCountPriceTest.java
│       │               ├── TC_09_MultipleSeatTypesTest.java
│       │               ├── TC_10_SeatReservationTest.java
│       │               ├── TC_11_EndToEndBookingTest.java
│       │               ├── TC_17_BookingConfirmationTest.java
│       │               ├── TC_18_ConfirmBookingIDTest.java
│       │               ├── TC_19_PostBookingDisplayTest.java
│       │               └── TC_20_BookingHistoryTest.java
│       └── resources
│           └── testdata
│               ├── cities.json
│               └── movies.json
└── reports
    └── extent-report.html   # Generated Extent Report
```

## Setup Instructions
1. **Clone the Repository**
   ```
   git clone <repository-url>
   cd DemoTestingFrameworkPOM
   ```

2. **Install Dependencies**
   Ensure you have Maven installed. Run the following command to install the required dependencies:
   ```
   mvn clean install
   ```

3. **Configuration**
   Update the `src/main/resources/config.properties` file with the necessary URLs and credentials for the application under test.

4. **Running Tests**
   You can run the tests using the following command:
   ```
   mvn test
   ```

## CI/CD Integration
The project is integrated with GitHub Actions for continuous integration. The workflow defined in `.github/workflows/ci.yml` will automatically run the tests on every push or pull request.

## Reporting
Test results are logged using Extent Reports. The generated report can be found in the `reports` directory as `extent-report.html`.

## Test Cases
The following test cases have been automated:
- Location Selection
- Movie Selection
- View Movies
- Smoke Tests
- Theatre Selection
- Seat Selection
- End-to-End Booking
- Booking Confirmation

For more details on each test case, refer to the respective test class files in the `src/test/java/com/example/tests` directory.

## Contribution
Feel free to contribute to this project by submitting issues or pull requests.