package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        java.lang.String name=null;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        name = reader.readLine();

        int year = Integer.parseInt(reader.readLine());
        int month = Integer.parseInt(reader.readLine());
        int day = Integer.parseInt(reader.readLine());

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился "+ day + "." + month + "." + year);
    }
}
