package com.cybertek.tests.homeworkTest;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase4_1 {

    Actions action;
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://qa1.vytrack.com/");
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {

        WebElement username=driver.findElement(By.id("prependedInput"));
        username.sendKeys("storemanager85");
        WebElement password=driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        WebElement submit=driver.findElement(By.id("_submit"));
        submit.click();

        Actions action=new Actions(driver);
           WebElement activity=driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]/a/span"));
           Thread.sleep(3000);
           action.moveToElement(activity).click().perform();

        Actions actions=new Actions(driver);
           WebElement  calendar=driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]/div/div/ul/li[4]/a/span"));
           actions.moveToElement(calendar).click().perform();
           Thread.sleep(3000);





        WebElement dot =driver.findElement(By.xpath("//table/tbody/tr[14]/td[9]"));
        JavascriptExecutor js= (JavascriptExecutor) driver ;
        js.executeScript("arguments[0].click();", dot);
      //  action.moveToElement(dot).click().perform();
        Thread.sleep(3000);


    }



}
