package com.cybertek.utilities;

import java.io.FileInputStream;
import java.util.Properties;

// reads the properties file configuration.properties

public class ConfigurationReader {

    private static Properties properties;

    static {

        try {  // what file to read
            String path = "configuration.properties";
             // read the file into java ,finds the file using the string path
            FileInputStream input = new FileInputStream(path);
            // properties class that loads properties in key / value format
            properties = new Properties();
            // the value from the file input is loaded /fed into the properties object
            properties.load(input);

            input.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static String get(String keyName) {

        return properties.getProperty(keyName);
    }

}
