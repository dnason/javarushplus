package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String x = bufferedReader.readLine();
        double t = Double.parseDouble(x);
        double tn= t%5;

        if (tn >=0 && tn <3 )
            System.out.println("зелёный");
        if (tn >=3 && tn <4)
        System.out.println("жёлтый");
        if (tn >=4 && tn < 5)
        System.out.println("красный");

        //напишите тут ваш код
    }
}