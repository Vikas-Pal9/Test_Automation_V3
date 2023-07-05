package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

     System.setProperty("webdriver.chromedriver","C:\\Users\\vikas pal\\OneDrive\\Documents\\GitHub\\Test_Automation_V3\\chromedriver.exe");

     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();

     driver.get("https://www.Booking.com");
     System.out.println("Opening Booking.com");
     Thread.sleep(5000);
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
     Thread.sleep(5000);
     driver.findElement(By.xpath("//h3[contains(.,'Availability')]/parent::div/following-sibling::div//input")).click();
     System.out.println("Clicking on the Availability checkbox");
     Thread.sleep(5000);
//     driver.findElement(By.xpath("(//span[contains(.,'Set your own budget')]/parent::label/parent::div/input)[2]")).click();
//     System.out.println("Write the code to handle the slider");
//     driver.findElement(By.xpath("(//span[contains(.,'Set your own budget')]/parent::label/parent::div/input)[2]")).click();
//     Thread.sleep(2000);
     driver.findElement(By.xpath("(//span[contains(.,'Set your own budget')]/parent::label/parent::div/following-sibling::div/input)[6]")).click();
     System.out.println("Clicking on the $0-$5000 checkbox");
     Thread.sleep(5000);
    driver.findElement(By.xpath("(//input[@name=\"popular_activities=447\"])[2]")).click();
     // driver.findElement(By.xpath("(//input[@aria-label=\"Bicycle rental: 43 properties\"])[2]")).click();
     System.out.println("Clicking on Bicycle checkbox");
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//input[@aria-label=\"Bike tours: 38 properties\"])[2]")).click();
     System.out.println("Clicking on Bike checkbox");
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//input[@aria-label=\"Hiking: 33 properties\"])[2]")).click();
     System.out.println("Clicking on Hiking checkbox");
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//input[@aria-label=\"Walking tours: 33 properties\"])[2]")).click();
     System.out.println("Clicking on Walking checkbox");
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//input[@aria-label=\"Evening entertainment: 25 properties\"])[2]")).click();
     System.out.println("Clicking on EE checkbox");
     Thread.sleep(2000);

     driver.findElement(By.xpath("//span[contains(.,'Hostel 360 Degree')]")).click();
     Thread.sleep(5000);

     System.out.println("Feel Happy your code is working fine till the END!!!");


    }
}