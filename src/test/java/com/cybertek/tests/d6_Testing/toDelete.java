package com.cybertek.tests.d6_Testing;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class toDelete {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
        driver.get("https://neilpatel.com/blog/boost-conversions-with-dynamic-content/");

        driver.findElement(By.xpath("//header/div/div/a")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='form-text']")).sendKeys("https://www.ebay.com/");

        driver.findElement(By.cssSelector("[class$='-submit']")).click();


    }


}
