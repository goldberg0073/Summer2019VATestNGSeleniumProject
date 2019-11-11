package com.cybertek.tests.O2_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;

public class ToDelete {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");

        WebElement help=driver.findElement(By.xpath("(//a[.='Your Orders'])[2]"));
        System.out.println(help);
        help.click();

        driver.findElement(By.xpath("//input[@*='email']")).sendKeys("hicham_goldberg@hotmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[@*='continue'])[2]")).click();




    }
}
