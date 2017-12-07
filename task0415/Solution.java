package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String x = bufferedReader.readLine();
        Integer a = Integer.valueOf(x);

        String y = bufferedReader.readLine();
        Integer b = Integer.valueOf(y);

        String z = bufferedReader.readLine();
        Integer c = Integer.valueOf(z);

       if (a+b > c && b+c >a && a+c >b ) {
           System.out.println("Треугольник существует.");
       }
       else {
           System.out.println("Треугольник не существует.");
    }
}
}