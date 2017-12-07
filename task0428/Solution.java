package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int i = 0;

        if (a>0 && b>0 && c>0)
        {i = 3;}
        else if (a>0 && b>0)
        {i=2;}
        else if (a>0 && c>0)
        {i=2;}
        else if (a>0)
        { i=1;}
        else if (b>0)
        { i=1;}
        else if (c>0)
        { i=1;}

        else if (a<=0 && b<=0 && c<=0) {
            i=0;
        }
        System.out.println(i);
        //напишите тут ваш код

    }
}
