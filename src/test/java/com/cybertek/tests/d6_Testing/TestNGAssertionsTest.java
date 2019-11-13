package com.cybertek.tests.d6_Testing;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNGAssertionsTest {

    @Test
    public void test1(){
        System.out.println("This is first assertion");
        Assert.assertEquals("one","one");

        System.out.println("This is the second assertion");
        Assert.assertEquals(1,1);
    }


    @Test
    public void test2(){
        Assert.assertNotEquals("one","two");
    }

    @Test
    public void test3(){
        //String actual="Cbt";
       // String expected="C";
   // Assert.assertTrue(expected.equals(actual));   // it takes a boolean expression
    //    System.out.println();
    Assert.assertTrue("hidndv@hotmail.com".contains("@"),"All email must contain @ sign");
        System.out.println();
    }

    @Test
    public void test5(){
        Assert.assertEquals("CBT","Cb","Title did not match");
    }

    @AfterMethod
    public void teardownMethod(){
        System.out.println("close CHROME");
    }
}
