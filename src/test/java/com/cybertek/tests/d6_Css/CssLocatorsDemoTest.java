package com.cybertek.tests.d6_Css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssLocatorsDemoTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button=driver.findElement(By.cssSelector("button#disappearing_button"));
        System.out.println(button.getText());

        WebElement home=driver.findElement(By.cssSelector(".nav-link"));
        System.out.println(home.getText());

        WebElement button6=driver.findElement(By.cssSelector("[name='button6'][onclick='button6()']"));
        System.out.println(button6.getText());





    }
}
