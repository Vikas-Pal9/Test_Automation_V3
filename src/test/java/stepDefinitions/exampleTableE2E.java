package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class exampleTableE2E {

    WebDriver driver;
    @Given("user navigate to the application")
    public void user_navigate_to_the_application() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\vikas pal\\\\OneDrive\\\\Documents\\\\GitHub\\\\Test_Automation_V3\\\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        System.out.println("User landed on the application successfully");
        Thread.sleep(5000);
    }
    @When("user Login with the {string} and {string}")
    public void user_login_with_the_and(String username, String password) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
        System.out.println("user entered the username: "+ username);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
        System.out.println("user entered the password: "+ password);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        Thread.sleep(5000);
    }
    @Then("user selects the products")
    public void user_selects_the_products() throws InterruptedException {
        System.out.println("user landed on product section");
       driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
       Thread.sleep(2000);
    }
    @Then("user go to the cart and clicks on checkout")
    public void user_go_to_the_cart_and_clicks_on_checkout() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        System.out.println("user successfully added the product to cart");
        Thread.sleep(5000);
    }
    @And("user enters their {string} {string} and {string}")
    public void user_enters_their_and(String firstname, String lastname, String pincode) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys(firstname);
        System.out.println("user entered the firstname: "+ firstname);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys(lastname);
        System.out.println("user entered the lastname: "+ lastname);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys(pincode);
        System.out.println("user entered the pincode: "+ pincode);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        Thread.sleep(5000);
    }
    @Then("user clicks on finish to buy the product")
    public void user_clicks_on_finish_to_buy_the_product() throws InterruptedException {
        System.out.println("user landed on the last page on the application");
        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
        Thread.sleep(5000);
        System.out.println("Congratulations!!! your code is working properly");
        driver.quit();
    }

}
