package com.cybertek.tests.d14_properties_driver_class_test_base_class;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PropertiesTest {

    @Test
    public void test1(){
      // we provide the key of the property to get method
        String browser= ConfigurationReader.get("browser");
        System.out.println(browser);
     //   Assert.assertEquals(browser,"firefox");
        System.out.println(ConfigurationReader.get("url"));
        // when you provide a key that does not exist s returns null
        System.out.println(ConfigurationReader.get("mybrowser"));

    }
}
