package com.cybertek.tests.d4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullName= driver.findElement(By.name("full_name"));  // if name is giving exception we use the full_name
        fullName.sendKeys("Bill goldberg");
        WebElement email =driver.findElement(By.name("email"));
        email.sendKeys("hicham_raja@hotmail.com");

        WebElement submitbuttom=driver.findElement(By.name("wooden_spoon"));
        submitbuttom.click();
    }
}
