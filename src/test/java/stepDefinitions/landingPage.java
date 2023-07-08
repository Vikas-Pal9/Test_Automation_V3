package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class landingPage {

    WebDriver driver;
    @Given("user lands on the Booking.com home page")
    public void user_lands_on_the_booking_com_home_page() throws InterruptedException {
        System.setProperty("webdriver.chromedriver","C:\\Users\\vikas pal\\OneDrive\\Documents\\GitHub\\Test_Automation_V3\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("https://www.Booking.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        System.out.println("Opening Booking.com");
        System.out.println("Landing page appears");
    }
    @When("user search and selects the hotels")
    public void user_search_and_selects_the_hotels() throws InterruptedException {
        driver.findElement(By.xpath("//button[@aria-label=\"Dismiss sign-in info.\"]")).click();
        System.out.println("Clicking on Dismiss botton of popup");
        driver.findElement(By.xpath("//input[@placeholder=\"Where are you going?\"]")).sendKeys("Manali");
        System.out.println("Searching Results for Manali");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'Old Manali')]")).click();
        System.out.println("Clicking on Old Manali");
        driver.findElement(By.xpath("(//span[contains(.,'20')])[1]")).click();
        driver.findElement(By.xpath("(//span[contains(.,'23')])[1]")).click();
        System.out.println("Selecting dates for Journey");
        driver.findElement(By.xpath("//button[@data-testid=\"occupancy-config\"]")).click();
        //add if condition to check no. of adults are 2
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'Done')]")).click();
        driver.findElement(By.xpath("(//span[contains(text(),'Search')])[1]")).click();
        System.out.println("Got the Search results");
        System.out.println("Selected the hotel on Booking.com");
    }
    @Then("user validates the hotel that they have selected")
    public void user_validates_the_hotel_that_they_have_selected() {
        System.out.println("validating the hotel");
        driver.quit();
    }

}
