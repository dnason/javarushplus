package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int q=0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());


        if (number%2 == 0)
        {
            q=1;
        }
        else {
            q=0;
        }
        if ( number <0 && q == 1)
        {
            System.out.println("отрицательное четное число");
        }
        else if ( number < 0 && q == 0)
        {
            System.out.println("отрицательное нечетное число");
        }
        else if ( number == 0)
        {
            System.out.println("ноль");
        }
        else if ( number >0 && q == 1)
        {
            System.out.println("положительное четное число");
        }
        else if (number > 0 && q == 0)
        {
            System.out.println("положительное нечетное число");
        }
        //напишите тут ваш код
    }
}

