package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int q = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double number = Double.parseDouble(reader.readLine());

        if (number % 2 == 0) {
            q = 1;
        } else {
            q = 0;
        }
        double d = number / 1000;
        if ( d > 0 && d >= 0.1 && d < 1 && q == 1 )
        {
            System.out.println("четное трехзначное число");
        }
        else if (d > 0 && d >=0.1 && d < 1 && q == 0)
        {
            System.out.println("нечетное трехзначное число");
        }
        else if (d > 0 && d >= 0.01 && d <0.1 && q == 1)
        {
            System.out.println("четное двузначное число");
        }
        else if (d > 0 && d >= 0.01 && d < 0.1 && q == 0)
        {
            System.out.println("нечетное двузначное число");
        }

        else if ( d >0 && d < 0.01 && q == 1) {
            System.out.println("четное однозначное число");
        }
        else if (d >0 && d < 0.01 && q == 0)
        {
            System.out.println("нечетное однозначное число");
        }
       // else if ()
        //напишите тут ваш код

    }
}
