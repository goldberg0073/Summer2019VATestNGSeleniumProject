
package com.cybertek.tests.vytrack_project_login;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class possitive_login {
    public static void main(String[] args) throws InterruptedException {

       WebDriver driver= WebDriverFactory.getDriver("chrome");  // Open Chrome
        driver.get("https://qa2.vytrack.com/user/login");// go to the website

          //go to the Username field
        WebElement emailInput = driver.findElement(By.name("_username"));        // sendKeys -- > enters given text
        emailInput.sendKeys("User24");

        Thread.sleep(1000);

        // go to the Password
        WebElement passwordInput = driver.findElement(By.name("_password"));        // sendKeys -- > enters given text
        passwordInput.sendKeys("UserUser123");

        WebElement login = driver.findElement(By.id("_submit"));
        login.click();

        // verify that url changed to https://qa2.vytrack.com/
        String expected="https://qa2.vytrack.com/";
        String actual=driver.getCurrentUrl();

        if(expected.equals(actual)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }


      // close the browser
       // driver.quit();




    }


}