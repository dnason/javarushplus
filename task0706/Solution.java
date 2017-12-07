package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] house = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<house.length;i++)
        {   house[i]=Integer.parseInt(reader.readLine());
        }

        int summEven=0;
        for (int i=0;i < house.length; i=i+2)
            summEven+= house[i];
        int summOdd=0;
        for (int i=1; i<house.length; i=i+2)
            summOdd+= house[i];

        if (summEven > summOdd)
        {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
