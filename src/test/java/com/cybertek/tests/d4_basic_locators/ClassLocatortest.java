package com.cybertek.tests.d4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatortest {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        driver.manage().window().maximize();
        WebElement home=driver.findElement(By.className("nav-link"));
        home.click();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement title=driver.findElement(By.className("h3"));

        System.out.println(title.getText());

        // NEXT LINE is going to FAIL
        //if class has a space on it we can not use it

        WebElement element=driver.findElement(By.className("btn btn-primary"));



    }
}
