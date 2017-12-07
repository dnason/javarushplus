package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        java.lang.String name1=null;
        String name2=null;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         name1 = reader.readLine();
        name2= reader.readLine();

        if(name1.equals(name2)){
            System.out.println("Имена идентичны");
        } else if (
               name1.length() == name2.length())
        {
            System.out.println("Длины имен равны");
        }
//напишите тут ваш код


    }
}
