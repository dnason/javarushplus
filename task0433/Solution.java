package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int s = 10;
        String z = "";

        while (s != 0) {
            z = z + "S";
            s--;
        }
        System.out.println(z);

        s = 9;
        while (s != 0)
        {
            System.out.println(z);
            s--;
        }
        //напишите тут ваш код

    }
}
