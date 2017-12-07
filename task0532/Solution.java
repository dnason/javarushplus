package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int a = 0;
        for (int i = 0; i != n ; i++) {
            int m = Integer.parseInt(reader.readLine());
            if (i == 1)
                a = m;
            a = Math.max(a, m);
        }
        int maximum = a;
        System.out.println(maximum);
}}
