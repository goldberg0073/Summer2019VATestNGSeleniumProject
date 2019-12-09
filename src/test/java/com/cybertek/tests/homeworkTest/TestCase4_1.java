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

import java.beans.Customizer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.SimpleTimeZone;

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


        WebElement dot =driver.findElement(By.xpath("//table/tbody/tr/td[9]"));
        JavascriptExecutor js= (JavascriptExecutor) driver ;
        js.executeScript("arguments[0].click();", dot);
      //  action.moveToElement(dot).click().perform();
        Thread.sleep(3000);

        List<WebElement>items=driver.findElements(By.xpath("/html/body/ul/li/ul/li/a/i"));
        System.out.println(items.size());
        for (int i = 1; i <=items.size(); i++) {
            String xpath="/html/body/ul/li/ul/li["+i+"]/a/i";
            System.out.println(xpath);

            WebElement value=driver.findElement(By.xpath(xpath));
           System.out.println(value.getText());
            System.out.println(value.isDisplayed());
            Assert.assertTrue(value.isDisplayed());
        }



        }

    @Test
    public void testSetting() throws InterruptedException {

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

        WebElement setting=driver.findElement(By.xpath("//i[@class='fa-cog hide-text']"));
        setting.click();
        List<WebElement>list=driver.findElements(By.xpath("//*[@class='column-manager-table']/div/table/tbody/tr"));
        System.out.println(list.size());
        for (int i = 1; i <=list.size();i++) {
            if(i==1){

                continue;
            }

            String  xpath="//*[@class='column-manager-table']/div/table/tbody/tr["+i+"]/td/label";
            WebElement items=driver.findElement(By.xpath(xpath));
            Thread.sleep(1000);
            items.click();
            System.out.println(items.getText());



        }


        String xpathtitle ="//*[@class='column-manager-table']/div/table/tbody/tr[1]/td[3]/input";
        String xpathCalender="//*[@class='column-manager-table']/div/table/tbody/tr[2]/td[3]/input";
        WebElement title=driver.findElement(By.xpath(xpathtitle));
        WebElement Calendar =driver.findElement(By.xpath(xpathCalender));
        Assert.assertTrue(title.isDisplayed());


        System.out.println(title.isSelected());
        System.out.println(Calendar.isSelected());


    }


    @Test
    public void save() throws InterruptedException {
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


        WebElement saveCalendar=driver.findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']"));
        saveCalendar.click();
        Thread.sleep(1000);
        WebElement saveselection=driver.findElement(By.xpath("//a[@class='btn-success btn dropdown-toggle']"));
        saveselection.click();

        List<WebElement>savelist=driver.findElements(By.xpath("//div/ul/li/button"));


        for (int i = 1; i <=savelist.size(); i++) {
             String saveXpath="//div/ul/li["+i+"]/button";
             WebElement saveButton=driver.findElement(By.xpath(saveXpath));

            System.out.println(saveButton.getText());
            System.out.println(saveButton.isEnabled());
        }

    }

    @Test
    public  void test4() throws InterruptedException {
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


        driver.findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']")).click();



        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='btn back icons-holder-text ']")).click();

        WebElement allCalendarButton=driver.findElement(By.xpath("//h1[@class='oro-subtitle']"));
        System.out.println(allCalendarButton.isEnabled());
        System.out.println(allCalendarButton.isDisplayed());

    }


    @Test
    public  void test5() throws InterruptedException, ParseException {


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


        driver.findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']")).click();

        Thread.sleep(1000);
        WebElement HourStart=driver.findElement(By.xpath("//input[starts-with(@id,'time_selector_oro_calendar_event_form_start-uid')]"));
        System.out.println(HourStart.getText());




////*[@id='time_selector_oro_calendar_event_form_start-uid-5dedbefb05af1']


//     SimpleDateFormat hour=new SimpleDateFormat("HH:mm");
//
//     hour.parseObject(HourStart.getText());
////
//       String Starting =hour.format(HourStart.getText());
//        System.out.println(Starting);


    }

}
