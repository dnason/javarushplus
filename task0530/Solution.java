package com.javarush.task.task05.task0530;

import java.io.*;

/* 
Шеф, что-то не пашет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String ac = reader.readLine();
        String bc = reader.readLine();
        int a = 0;
        a = Integer.parseInt(ac);
        int b = 0;
        b=Integer.parseInt(bc);

        int sum = a + b;

        System.out.println("Sum = " + sum);
    }
}
