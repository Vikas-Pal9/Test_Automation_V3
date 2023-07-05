package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {

    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    void setup(String browser,String app) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chromedriver", "C:\\Users\\vikas pal\\OneDrive\\Documents\\GitHub\\Test_Automation_V3\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.get(app);
        driver.manage().window().maximize();
    }


    @Test(priority = 1)
    void logoTest() {
        WebElement logo =driver.findElement(By.id("nav-logo-sprites"));
        Assert.assertTrue(logo.isDisplayed(),"Logo is not Displayed");
        System.out.println("logo is Displayed");
    }

    @Test(dependsOnMethods = {"logoTest"},priority = 2)
    void homepageTitle() {
        String title = driver.getTitle();
        Assert.assertEquals(title,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Title is not matched");
        System.out.println("Title is matched");
    }

    @AfterClass
    void tearDown() {
        driver.quit();
    }
}
