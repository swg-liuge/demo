package com.example.demo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @description:
 * @author: swg
 * @created: 2018/5/23
 */
public class Test {

    public static void main(String[] args) throws IOException {
        InputStream stream = Test.class.getClassLoader().getResourceAsStream("test.properties");
        Properties properties = new Properties();
        properties.load(stream);
        System.out.println(properties.getProperty("test"));
    }
}
