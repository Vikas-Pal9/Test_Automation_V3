package org.example;

import org.testng.annotations.*;

public class TC1 {

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

    @Test
    void test1()
    {
        System.out.println("This is test 1");
    }

    @Test
    void test2()
    {
        System.out.println("This is test 2");
    }

    @BeforeTest
    void beforeTest()
    {
        System.out.println("Before Test");
    }

    @AfterTest
    void afterTest()
    {
        System.out.println("After Test");
    }

}
