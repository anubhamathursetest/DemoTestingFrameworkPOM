package com.example.tests.smoke;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.example.pages.HomePage;
import com.example.tests.BaseTest;
import org.testng.Assert;       

public class TC01_SmokeTest extends BaseTest {
    private HomePage homePage;

    @BeforeClass
    public void setUp() {
        homePage = new HomePage(driver);
    }

    @Test(priority = 1)
    public void testLocationSelection() {
        System.out.println("Executing Smoke Test: Location Selection");
        test.info("Navigating to the main page");
        try {
            test.info("Search a location");
            homePage.selectSearchedCity("Noida", "Noi", driver);
        } catch (InterruptedException e) {
            test.fail(e);
        }

        test.info("Verifying the selected location");
        String selectedLocation = homePage.getSelectedLocation();
        Assert.assertEquals(selectedLocation, "Noida", "Location selection failed!");
        test.pass("Location selected successfully: " + selectedLocation);
    }

}