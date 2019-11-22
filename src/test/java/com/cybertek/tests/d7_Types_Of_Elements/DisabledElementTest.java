package com.cybertek.tests.d7_Types_Of_Elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DisabledElementTest {
    @Test
    public void test1(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement green=driver.findElement(By.id("green"));
        System.out.println("is green enable:"+green.isSelected());

        green.click();

        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement input = driver.findElement(By.cssSelector("#input-example>input"));

        System.out.println("Is element enabled: "+input.isEnabled());

        input.sendKeys("dfaslkhjsdfglkj");








    }
}
