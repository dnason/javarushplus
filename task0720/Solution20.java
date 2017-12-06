package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution20 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < m; i++)
        {
            int tmp=list.get(i);
            list.add(list.size()-1,tmp);
            list.remove(i);
        }

        for (int i=0; i< list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}
