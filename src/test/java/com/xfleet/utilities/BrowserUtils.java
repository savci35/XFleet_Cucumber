package com.xfleet.utilities;

public class BrowserUtils {


    public static void sleep(int seconds)  {

        try {
            Thread.sleep(seconds*1000);
        }catch(InterruptedException e){
            System.out.println("static sleep issue");
        }
    }
}
