package org.example;

import org.testng.annotations.*;

public class TC2 {

    @BeforeClass
    void beforeClass()
    {
        System.out.println("This will run before class");
    }
    @AfterClass
    void afterClass()
    {
        System.out.println("This will run before class");
    }

    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("This is Before Method");
    }

   @AfterMethod
    void afterMethod()
    {
        System.out.println("This is after Method");
    }

    @Test(enabled = false)
    void test3()
    {
        System.out.println("This is test 3");
    }

    @Test(enabled = false)
    void test4()
    {
        System.out.println("This is test 4");
    }

    @BeforeSuite
    void beforeSuite(){
        System.out.println("Before Suit");
    }

    @AfterSuite
    void afterSuite(){
        System.out.println("After Suite");
    }

}
