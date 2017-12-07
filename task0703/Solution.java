package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        String[] words = new String[10];
        int[] numbers = new int[10];
        for (int i =0; i <10; i++)
        {
            words[i]=reader.readLine();
        }
        for (int i=0;i<10;i++)
        {
            String abc = words[i] ;
            int a = abc.length();
            numbers[i]=a;
        }

        for (int j=0;j<10;j++)
            System.out.println(numbers[j]);
    }}