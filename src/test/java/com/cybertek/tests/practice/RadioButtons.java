package com.cybertek.tests.practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioButtons {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.keynotesupport.com/internet/web-contact-form-example-radio-buttons.shtml");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        WebElement excel = driver.findElement(By.xpath("//input[@value='Excel']"));
        System.out.println("is enable "+excel.isEnabled());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(excel));
      //  excel.click();
    }
        @Test
        public void test2(){
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.get("http://practice.cybertekschool.com/radio_buttons");

//            WebElement Yallow=driver.findElement(By.id("yellow"));
//            Yallow.click();
//            WebElement FootBall=driver.findElement(By.id("football"));
//            FootBall.click();

            ///]
           //   List<WebElement>buttons=driver.findElements(By.xpath("/h5[.=contains(text(),user)"));
            List<WebElement>buttons=driver.findElements(By.xpath("//div[@class='radio']"));
            for (WebElement button:buttons){
                if(button.isEnabled()){
                    System.out.println(button.getText());

                }
            }



//            Assert.assertTrue(Yallow.isSelected());
//            Assert.assertTrue(FootBall.isSelected());

        }



}
