package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
     ArrayList<String> main =   new ArrayList<String>();
    main.add("мама");
    main.add("мыла");
    main.add("раму");

    main.add(1,"именно");
    main.add(3,"именно");
    main.add(5,"именно");

    for (int i=0; i < main.size(); i++)
        System.out.println(main.get(i));
}}
