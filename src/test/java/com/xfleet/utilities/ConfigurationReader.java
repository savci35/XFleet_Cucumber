package com.xfleet.utilities;
import java.io.FileInputStream;
import java.util.*;

public class ConfigurationReader {


  private static Properties prop = new Properties();

    static{

        FileInputStream file = new FileInputStream("configuration.properties");

        prop.load(file);
        file.close();

    }
}
