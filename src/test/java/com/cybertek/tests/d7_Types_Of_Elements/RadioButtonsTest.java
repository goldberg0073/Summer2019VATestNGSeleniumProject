package com.cybertek.tests.d7_Types_Of_Elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonsTest {

    @Test
    public void test1(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blue= driver.findElement(By.id("blue"));
        WebElement red=driver.findElement(By.id("red"));

        System.out.println("is blue selected:"+blue.isSelected());
        System.out.println("is red selected;"+red.isSelected());
        // Verify if blue is selected
        Assert.assertTrue(blue.isSelected());
        // Verify if the red is not selected
        Assert.assertFalse(red.isSelected());

        System.out.println("clicking on red");
        red.click();
        System.out.println("is blue selected:"+blue.isSelected());
        System.out.println("is red selected:"+red.isSelected());

        //verify blue is Not selected
        Assert.assertFalse(blue.isSelected());
        // Verify red is selected
        Assert.assertTrue(red.isSelected());



    }
}
