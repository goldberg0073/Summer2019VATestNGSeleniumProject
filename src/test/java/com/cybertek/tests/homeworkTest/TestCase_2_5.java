package com.cybertek.tests.homeworkTest;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.*;

public class TestCase_2_5 {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://en.wikipedia.org/wiki/2016_Summer_Olympics#Medal_table");
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

@Test
   public void  test1(){

    WebElement rank= driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/table[9]/tbody/tr[1]/td[1]"));
   // System.out.println(rank.getText());

    // all the rows ====> give me the table then // all the tr (rows) including the headers
    List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"mw-content-text\"]/div/table[9]/tbody/tr/td[1]"));
    System.out.println(rows.size());

    for (WebElement row : rows) {
        System.out.println(row.getText());
    }
}

@Test
    public void test2(){

    List actualList=new ArrayList();

    List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"mw-content-text\"]/div/table[9]/tbody/tr/td[1]"));
    System.out.println(rows.size());

    for (int i = 1; i < rows.size()-1; i++) {

        String xpath="//*[@id=\"mw-content-text\"]/div/table[9]/tbody/tr["+i+"]/td[1]";
        WebElement singleRow=driver.findElement(By.xpath(xpath));
      //  System.out.println(singleRow.getText());
         actualList.add(singleRow.getText());

    }
    System.out.println(actualList);

    List temp=new ArrayList();
    temp.addAll(actualList);
    System.out.println(temp);
    // Ascending
     Collections.sort(temp);

    System.out.println(temp);

  Assert.assertFalse(actualList.equals(temp));

}
  // //*[@id="mw-content-text"]/div/table[9]/tbody/tr[10]/th[1]
@Test
    public void test3() throws InterruptedException {

      driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/table[9]/thead/tr/th[2]")).click();

      Thread.sleep(3000);
//
//       List <WebElement> numberOfRows=driver.findElements(By.xpath("//*[@id=\"mw-content-text\"]/div/table[9]//tr"));
//    System.out.println("The number of the rows : "+numberOfRows.size());
//    for (WebElement numberOfRow : numberOfRows) {
//        System.out.println(numberOfRow.getText());
//    }
    List<WebElement>actualList=new ArrayList<>();
    List<WebElement>rowswithoutheader=driver.findElements(By.xpath("//*[@id=\"mw-content-text\"]/div/table[9]//tr"));
    System.out.println(rowswithoutheader.size());
    for (int i = 1; i <rowswithoutheader.size()-1; i++) {
        String xpath="//*[@id=\"mw-content-text\"]/div/table[9]/tbody/tr["+i+"]//a";


            WebElement singlerow=driver.findElement(By.xpath(xpath));
            System.out.println(singlerow.getText());
            actualList.add(singlerow);

    }
    System.out.println(actualList);

    List <WebElement>temp=new ArrayList<>();
    temp.addAll(actualList);

   // Collections.sort(temp);

    System.out.println(temp);

    Assert.assertTrue(actualList.equals(temp));
}

}
