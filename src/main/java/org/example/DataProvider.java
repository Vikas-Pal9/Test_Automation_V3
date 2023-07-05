package org.example;

import org.testng.annotations.Test;

public class DataProvider {

    @Test(dataProvider = "LoginDataProvider",dataProviderClass = CustomDataProvider.class)
    public void loginTest(String email, String pwd){
        System.out.println("Email - "+email+" "+"Password -"+pwd);
    }

}