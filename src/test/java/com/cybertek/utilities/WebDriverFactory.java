package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    // write a static method that takes a string parameters
    // based on the value of the parameter...the method must return Chromed river of Firefox driver object
    // name: getDriver


    public static WebDriver getDriver(String browserType){
        WebDriver driver=null;                  // WebDriver is a data type
        switch (browserType.toLowerCase()){
            case"chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();


        }
      return driver;

    }

}
