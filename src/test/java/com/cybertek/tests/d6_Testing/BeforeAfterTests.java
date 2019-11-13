package com.cybertek.tests.d6_Testing;

import org.testng.annotations.*;

public class BeforeAfterTests {

@Test
    public void test1(){
    System.out.println("this is test one");
}

@Test
public void test2(){
    System.out.println("this is second test");
}

   @BeforeMethod
    public void setupMethod(){
       System.out.println("BEFORE METHOD");
       System.out.println("opening CHROME");

   }
@AfterMethod
    public void teardownMethod(){
    System.out.println("closing CHROME");
}

@BeforeClass
    public void beforeclass(){
    System.out.println("this is before class : run one time ONLY");
}
@AfterClass
    public void afterclass(){
    System.out.println("this is after class :");
}


}
