package com.cybertek.tests.d14_properties_driver_class_test_base_class;

public class Singleton {

    // singleton class will have a private constructor
    // it means other classes cannot create object of this class
    private Singleton(){

    }
    static String str;
    public static  String getInstance (){
        // if stirIng has no value ,initialize it ND RETURN
        if(str==null){
            str="ice cream is good";
        }
        // else just return str
        else {
            System.out.println("it has already a value");
        }
        return str;
    }
}
