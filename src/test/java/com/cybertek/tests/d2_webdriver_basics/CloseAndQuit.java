package com.cybertek.tests.d2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        // TODO close one tab out of one
    //    driver.get("http://practice.cybertekschool.com/");
      //  Thread.sleep(1000);
       // close the current tab/window
        //driver.close();


        driver=new ChromeDriver();


        // TODO close one tab out of two tabs
        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(5000);
        driver.close();

        // TODO close all open tab
        // close all open windows and tabs and everything else
        driver.quit();




    }
}
