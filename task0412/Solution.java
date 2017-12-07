package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        String x = bufferedReader.readLine();

        Integer n = Integer.valueOf(x);
        if ( n == 0)
        {
            System.out.println("null");
        }
        if (n>0)
        {
            n=n*2;
            System.out.println(n);
        }
        if (n<0)
        {
            n=n+1;
            System.out.println(n);
        }
    }

}