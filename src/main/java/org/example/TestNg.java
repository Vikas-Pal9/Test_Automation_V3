package org.example;
import org.testng.annotations.Test;



public class TestNg {

    @Test(priority = 1)
   void setup() {
        System.out.println("Working");
    }

    @Test(priority = 2)
     void login(){
        System.out.println("login");
    }
    @Test(priority = 3)
     void down(){
        System.out.println("down");
    }

}
