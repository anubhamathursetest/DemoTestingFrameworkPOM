package com.example.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;

public class ExtentManager {
    private static ExtentReports extent;
    private static ExtentTest test;
    static ExtentSparkReporter htmlReporter;

    public static ExtentReports getInstance() {
        if (extent == null) {
            String reportPath = System.getProperty("user.dir") + "/reports/extent-report.html";
            htmlReporter = new ExtentSparkReporter(reportPath);
            extent = new ExtentReports();
            extent.attachReporter(htmlReporter);
            extent.setSystemInfo("OS", "Ubuntu 24.04.2 LTS");
            extent.setSystemInfo("Browser", "Chrome");
            extent.setSystemInfo("Automation Tester", "Your Name");
        }
        return extent;
    }

        private static final ThreadLocal<ExtentTest> TEST = new ThreadLocal<>();
    
        public static void startReport() {
            startReport("reports/extent-report.html");
        }
    
        public static void startReport(String reportPath) {
            if (extent == null) {
                ExtentSparkReporter html = new ExtentSparkReporter(reportPath);
                html.config().setTheme(Theme.STANDARD);
                extent = new ExtentReports();
                extent.attachReporter(html);
            }
        }
    
        // Overloads to match test usages
        public static ExtentTest createTest(String name) {
            return createTest(name, null);
        }
    
        public static ExtentTest createTest(String name, String description) {
            if (extent == null) startReport();
            ExtentTest t = (description == null) ? extent.createTest(name) : extent.createTest(name, description);
            TEST.set(t);
            return t;
        }
    
        public static void log(String message) {
            ExtentTest t = TEST.get();
            if (t != null) t.info(message);
        }
    
        public static void flushReports() {
            if (extent != null) extent.flush();
        }
    
        // Backwards-compatible names seen in tests
        public static void flushReport() { flushReports(); }
        public static void endReport() { flushReports(); }

    public static void flush() {
        if (extent != null) {
            extent.flush();
        }
    }
}