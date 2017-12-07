package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int summ = 0;
        while (true) {
            int a = Integer.parseInt(reader.readLine());
            if (a == -1){
                summ += a;
                break;
            }
            summ += a;
        }
        System.out.println(summ);
       }
}
