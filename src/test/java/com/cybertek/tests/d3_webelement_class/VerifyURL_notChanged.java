package com.cybertek.tests.d3_webelement_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURL_notChanged {
    public static void main(String[] args) {


        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        // Save the expected url
        String expectedUrl=driver.getCurrentUrl();

        //click on Retrieve password
       // WebElement retrievePassword;

  // WebElement ===> class hat represents element from web page
        // findElement ==> method used to find element
       // returns a web element
        WebElement retrievePassword =driver.findElement(By.id("form_submit"));

        // click the element
        retrievePassword.click();


        // verify URL did not change
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.equals(expectedUrl)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }







    }
}
