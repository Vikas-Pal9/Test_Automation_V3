package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGSecond {

    @Test(priority = 1)
    void setup()
    {
        System.out.println("new project");
        Assert.assertEquals(1,1);
    }
    @Test(priority = 2)
    void login()
    {
        System.out.println("new project");
    }
    @Test(priority = 4)
    void book()
    {
        System.out.println("new project");
    }
    @Test(priority = 3)
    void addProduct()
    {
        System.out.println("new project");
    }

}
