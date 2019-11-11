package com.cybertek.tests.d1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserDemo {


    public static void main(String[] args) {



        // we Have to enter this line every time we want to open chrome
        // without it we get exception
        WebDriverManager.chromedriver().setup();

        //this part is selenium
        //WebDriver==> represents browser
        // new chromeDriver() ===> this line opens chrome browser

        WebDriver driver=new ChromeDriver();

    }
}
