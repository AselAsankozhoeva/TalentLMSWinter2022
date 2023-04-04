package com.digital.asserts;

public class SleepIn1 {
    public static boolean sleep(boolean weekday, boolean vacation) {
        if(!weekday || vacation){
            return true;
        }
        return false;
    }
}
