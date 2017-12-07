package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<Integer> main = new ArrayList<Integer>();
       ArrayList<Integer> first = new ArrayList<Integer>();
       ArrayList<Integer> second = new ArrayList<Integer>();
        ArrayList<Integer> third = new ArrayList<Integer>();

        for (int i=0; i<20; i++)
        {
            main.add(Integer.parseInt(reader.readLine()));
        }
        for(int i=0; i< main.size(); i++)
        {
            int x=main.get(i);
            if (x% 3 == 0)
                first.add(x);

            if (x % 2 == 0)
            {   second.add(x); }

            else if ( x % 2 !=0 && x%3 !=0 )

            third.add(x);
        }
        printList(first);
        printList(second);
        printList(third);
    }

    public static void printList(List<Integer> list) {
        for (int i=0; i< list.size(); i++)
        { System.out.println(list.get(i));}
    }
}