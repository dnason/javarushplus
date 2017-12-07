package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> me = new ArrayList<>();

        for (int i=0; i<5;i++)
            me.add(i,reader.readLine());

        for(int i=0;i<13;i++)
            me.add(0, me.remove(me.size()-1));
        for (int i=0; i< me.size(); i++)
            System.out.println(me.get(i));

    }
}
