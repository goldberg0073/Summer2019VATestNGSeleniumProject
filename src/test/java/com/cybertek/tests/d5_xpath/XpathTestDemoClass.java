package com.cybertek.tests.d5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathTestDemoClass {


    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

//        WebElement link= driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
//        System.out.println(link.getText());     // absolute xpath

        WebElement link2=driver.findElement(By.xpath("//h3"));
        System.out.println(link2.getText());     // relative xpath


//        WebElement link3 =driver.findElement(By.xpath("//button[@onclick='button1()']"));
//        System.out.println(link3.getText());   //   attribute value with o'clock attribute
//

//
//        WebElement link4 =driver.findElement(By.xpath("//button[@*='button1()']"));
//        System.out.println(link4.getText());

//
//        WebElement link5=driver.findElement(By.xpath("//button[.='button1()']"));
//        System.out.println(link5.getText());


//        WebElement link6=driver.findElement(By.xpath("//btn btn-primary"));
//        System.out.println(link6.getText());


//        WebElement link7=driver.findElement(By.xpath("//button[starts-with(@id,'button_')]"));
//        System.out.println(link7.getText()); // startswith



        WebElement link8=driver.findElement(By.xpath("//button[1]"));
        System.out.println(link8.getText());













    }

}
