package com.entrustech.hackerrank.kangaroo;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        String result = "NO";
        boolean met = false;
                
        int newx1 = x1;
        int newx2 = x2;
        while(!met) {
            if(newx2 < newx1){
                met = false;
                break;
            }
            newx1 = newx1 + v1;
            newx2 = newx2 + v2;
            if(newx1 == newx2) {
                met = true;
                break;
            }
        }
        if(met)
            result = "YES";
        return result;
    }

}