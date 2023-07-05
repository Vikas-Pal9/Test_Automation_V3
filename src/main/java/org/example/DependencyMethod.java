package org.example;

import org.testng.annotations.Test;

public class DependencyMethod {

    //Grouping Example
    @Test(groups = {"sanity"}, priority = 1)
    void startCar(){
        System.out.println("Car Started");
    }
    @Test(groups = {"sanity"}, priority = 2)
    void driveCar(){
        System.out.println("Car Driving");
    }
    @Test(groups = {"regression"}, priority = 1)
    void  stopCar(){
        System.out.println("Car Stopped");
    }
    @Test(groups = {"regression","sanity"}, priority = 3)
    void ParkCar() {
        System.out.println("Car Parked");
    }
}
