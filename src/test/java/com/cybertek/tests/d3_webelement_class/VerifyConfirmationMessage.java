package com.cybertek.tests.d3_webelement_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {
    public static void main(String[] args) {

        //open the browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        // enter any email
        WebElement emailInput=driver.findElement(By.name("email"));
        // sendKeys===> enters given text
        String expectedEmail="hicham.goldberg@hotmail.com";
        emailInput.sendKeys(expectedEmail);
        // verify that email is displayed in the input box

        String actualEmail=emailInput.getAttribute("value");

       if(expectedEmail.equals(actualEmail)){
           System.out.println("PASS");
       }else{
           System.out.println("FAIL");
           System.out.println("actualEmail = " + actualEmail);
           System.out.println("expectedEmail = " + expectedEmail);
       }

       // click on Retrieve password
        WebElement retrievePassword=driver.findElement(By.id("form_submit"));
       retrievePassword.click();

       // verify that confirmation message says 'Your e-mail's been sent!'
        String expectedMessage="'Your e-mail's been sent!'";

        WebElement messageElement=driver.findElement(By.name("confirmation_message"));
        String actualMessage=messageElement.getText();

       if(expectedEmail.equals(actualMessage)){
           System.out.println("PASS");
       }else{
           System.out.println("FAIL");
           System.out.println("actualMessage = " + actualMessage);
           System.out.println("expectedMessage = " + expectedMessage);

       }



    }
}
