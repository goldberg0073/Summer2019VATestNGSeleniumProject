package com.cybertek.tests.d12_review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class hoverTest {
    WebDriver driver;
    Actions actions;
    @BeforeMethod
    public void SetUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/hovers");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

   @Test
    public void test(){

       for(int i=0;i<3;i++){
           //hover over the each image
           //verify test user1,user2,user3
           System.out.println(i);

           WebElement image=driver.findElement(By.tagName("img"));
           actions.moveToElement(image).perform();
          // this is like calling thread sleep
           actions.pause(2000);
           WebElement text=driver.findElement(By.xpath("//h5[.='name: user1']"));
           Assert.assertTrue(text.isDisplayed());
       }



   }



}
