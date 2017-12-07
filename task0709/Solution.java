package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> me = new ArrayList<String>();
        int min=2147483647;

       for (int i=0; i < 5;i++)
         me.add(reader.readLine());

       for (int i=0;i < me.size(); i++)
       {
           String str1 = me.get(i) ;
           int z = str1.length();

           if (z<=min)
           {  min =z;}
       }

       for (int i=0; i < me.size(); i++)
       {   String str1;
            str1=  me.get(i);
            int z = str1.length();
            if ( z == min)
            {
                System.out.println(str1);
            }
       }

    }
}
