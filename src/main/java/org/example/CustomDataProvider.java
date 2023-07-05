package org.example;

public class CustomDataProvider {
    @org.testng.annotations.DataProvider(name = "LoginDataProvider")
    public Object[][] getData() {
        Object[][] data = {{"abc@gmail.com","abc"}, {"xyz@gmail.com","xyz"}, {"mno@gmail.com","mno"},{"new@gmail.com","new"}};
        return data;
    }
}
