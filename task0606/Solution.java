package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        char[] number2 = number.toCharArray();

        for (int i=0; i< number2.length; i++) {
            int x = Character.getNumericValue(number2[i]);
            if (x % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: "+ even + " Odd: " + odd);
    }
}