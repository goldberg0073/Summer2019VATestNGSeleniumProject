package com.cybertek.tests.d8_select_list;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClassTest {

@Test
    public void printAllOptions(){

    WebDriver driver= WebDriverFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/dropdown");
     // Locate the element with the select tag
    WebElement element= driver.findElement(By.id("state"));

    // Create Select object by passing the element from step2 as constructor
    Select stateList = new Select(element);
    //getOption()===>  Returns all available options from the dropdown List
             List<WebElement> options= stateList.getOptions();

             for(WebElement option:options){
                 System.out.println(option.getText());
             }
}


   @Test
   public void  selectAndVerifySelected() throws InterruptedException {

       WebDriver driver= WebDriverFactory.getDriver("chrome");
       driver.get("http://practice.cybertekschool.com/dropdown");
       // Create a select object
       // locate the WebElement with the select tag
       // create Select class object by passing that WebElement as a constructor

       Select StateList=new Select(driver.findElement(By.id("state")));

       //Verify that by default "Select a State" is selected

       String actualSelection = StateList.getFirstSelectedOption().getText();

       System.out.println("actualSelection="+actualSelection);


       Assert.assertEquals(actualSelection,"Select a State");


       Thread.sleep(1000);
       // SELECT USING VISIBLE TEXT

       StateList.selectByVisibleText("Ohio");

       actualSelection=StateList.getFirstSelectedOption().getText();
       Assert.assertEquals(actualSelection,"Ohio");

    // SELECT USING INDEX
       // SELECTBYINDEX ====>SELECTS USING THE INDEX OF THE OPTION , COUNT STARTS FROM 0
       StateList.selectByIndex(51);

       actualSelection=StateList.getFirstSelectedOption().getText();
       Assert.assertEquals(actualSelection,"Wyoming");

       // SELECT BY VALUE
       StateList.selectByValue("DC");
       Assert.assertEquals(actualSelection,"District Of Columbia");

}

}
