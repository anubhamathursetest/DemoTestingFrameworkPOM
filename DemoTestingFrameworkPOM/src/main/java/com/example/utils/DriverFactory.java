package com.example.utils;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    static WebDriver driver;

    public static WebDriver initializeDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "/src/main/resources/chromedriver-linux64.zip"); 
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            driver = new ChromeDriver(options);
        }
        return driver;
    }

    public static WebDriver initializeDriver(String browser) {
        System.out.println("Initializing driver for browser: " + browser);
        if (driver == null && browser.equalsIgnoreCase("chrome")) {
            File file = new File("src/main/resources/chromedriver");
            System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
            //System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver"); 
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            driver = new ChromeDriver(options);
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}