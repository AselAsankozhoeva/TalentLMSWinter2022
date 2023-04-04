package com.digital.asserts;

public class Makes10 {
    public static boolean makes10(int a, int b) {
        if(a == 10 || b == 10){
            return true;
        }
        if (a + b == 10){
            return true;
        }
        return false;
    }
}
