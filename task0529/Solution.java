package com.javarush.task.task05.task0529;

import java.io.*;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;

            while(true) {
                String str = reader.readLine();
                if ("сумма".equals(str)) {
                    System.out.println(sum);
                    break;
                }
                else {
                    sum += Integer.parseInt(str);
                }

            }
}}
