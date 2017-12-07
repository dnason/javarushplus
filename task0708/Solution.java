package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList();

        for (int i=0; i <5; i++)
        strings.add (reader.readLine());

        int lengthStr1;
        int max=0;
        for (int i=0; i< strings.size() ; i++ )
        {
            String str1=null;
            str1=strings.get(i);
            lengthStr1 =str1.length();

            if (lengthStr1 >= max)
            { max = lengthStr1; }
        }
        for (int i=0;i<strings.size(); i++)
        {
            int z;
            String str1=null;
            str1=strings.get(i);
            z =str1.length();
            if (z == max)
            {
                System.out.println(str1);
            }
    }
}}
