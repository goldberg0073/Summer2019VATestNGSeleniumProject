package com.cybertek.tests.vytruck_negative_login;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Negative_login {
    public static void main(String[] args) throws InterruptedException {

        // call the chrome browser using the web driver and go to the given website "login page of vytruck app"
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver1 =new ChromeDriver();
//        driver1.get("https://qa2.vytrack.com/user/login");

        //go to the Username field
        WebElement UserName = driver.findElement(By.name("_username"));
        UserName.sendKeys("Jocker");

        Thread.sleep(1000);

        // go to the Password field
        WebElement Password = driver.findElement(By.name("_password"));
        Password.sendKeys("2019");

        Thread.sleep(1000);

        // go to the login button
        WebElement login= driver.findElement(By.id("_submit"));
        login.click();


        String expectedText="Invalid user name or password.";
        String actualText=driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[1]/div")).getText();


        System.out.println(actualText);
        System.out.println(expectedText);

        if(expectedText.equals(actualText)){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }


    }

}
