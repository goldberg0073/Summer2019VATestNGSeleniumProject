package com.cybertek.tests.d3_webelement_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLChanged {
    public static void main(String[] args) {


        // open the browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        // enter any email
        WebElement emailInput=driver.findElement(By.name("email"));
        // sendKeys ===> enter given text

        emailInput.sendKeys("hicham_goldberg@hotmail.com");
        // click on Retrieve password
        WebElement retrievePassword = driver.findElement(By.id("form_submit"));
        retrievePassword.click();

        // * verify that url changed to
        String expected="http://practice.cybertekschool.com/email_sent";
        String actual=driver.getCurrentUrl();

        if (actual.equals(expected)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }








    }
}