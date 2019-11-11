package com.cybertek.tests.d2_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallTheFactory {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        // WebDriverFactory ==>the class name
        // getDriver is the method inside the class that we call



    }
}
