package com.cybertek.tests.d9_tabs_frames_alerts_popups;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

     @Test
    public void switchWindowsTest(){
        driver.get("http://practice.cybertekschool.com/windows");
        System.out.println("Before new window is opened "+driver.getTitle());

        //open new Window
        driver.findElement(By.linkText("Click Here")).click();

         System.out.println("After new window is opened "+driver.getTitle());

         // window()====> changes between tabs,window
        // driver.switchTo().window("New Window");

         String currentWindowHandle=driver.getWindowHandle();
         System.out.println("currentWindowHandle = "+currentWindowHandle);
         // getWindowHandles =====> return as a set
          Set<String> windowHandles=driver.getWindowHandles();

          for (String windowHandle:windowHandles){
              System.out.println(windowHandle);
              // itirate the set oh handles and compare to the current handle
              //if the handle is not equal to the current than it is the handle of the new window

              if(!currentWindowHandle.equals(windowHandle)){
                 //switchthe new window by passing its handle
                  driver.switchTo().window(windowHandle);

              }
          }
         System.out.println("After switching "+driver.getTitle());

     }


    @Test
    public void changeByTitle(){
        driver.get("http://practice.cybertekschool.com/windows");
        String targetTitle="New Window";
        driver.findElement(By.linkText("Click Here")).click();
        // how many windows are open right now
        System.out.println(driver.getWindowHandles().size());

        // itirate through all windows
        for (String handle: driver.getWindowHandles()) {
            // switch to them one by one
            driver.switchTo().window(handle);
            // get the title and compare target title
            if (driver.getTitle().equals(targetTitle)) {
                // stop looping
                break;
            }
        }

        System.out.println(driver.getTitle());

    }







}
