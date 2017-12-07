package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> most = new ArrayList<>();
        int min=3;
        int n,max=0;
        String Tmp;

        for (int i=0; i<10;i++)
         most.add(reader.readLine());

         for (int i=0; i<most.size()-1 ;i++){
            Tmp = most.get(i);
            n = Tmp.length();
            if (n < min)
                 min =n; }

        for (int i=0; i<most.size()-1 ;i++)
        {
            Tmp = most.get(i);
            n = Tmp.length();
            if (n > max)
                max = n;
        }
        for (int i=0; i<most.size()-1;i++)
        {      Tmp = most.get(i);
                n = Tmp.length();
                if (n == min || n == max )
            {
                System.out.println(Tmp);
                break;
            }
        }

    }
}
