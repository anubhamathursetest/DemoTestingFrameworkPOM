package com.example.tests;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import com.example.utils.DriverFactory;
import com.example.utils.ExtentManager;
import com.aventstack.extentreports.ExtentTest;


public class BaseTest {
    public ExtentTest test;
    public WebDriver driver;

    public static Properties baseProperties = new Properties();

    @BeforeSuite
    public void setUp() {
        System.out.println("Inside BaseTest setUp");
        try (FileInputStream fis = new FileInputStream("src/test/resources/testdata/base.properties")) {
            baseProperties.load(fis);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load base.properties", e);
        }
        driver = DriverFactory.initializeDriver(baseProperties.getProperty("browser"));
        driver.manage().window().maximize();
        driver.get(baseProperties.getProperty("url"));
    }

    @BeforeMethod
    public void updateSetUp(Method method) {
        test = ExtentManager.createTest(method.getName());
    }

    @AfterSuite
    public void tearDown() {
        DriverFactory.quitDriver();
        ExtentManager.flushReports();
    }
}