package com.javarush.task.task04.task0438;

/* 
Рисуем линии
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int z=0;
        int m=10;
        String s= "";

        for ( z=0;z < m; z++)
        {
            s = s + "8";
        }
        System.out.print(s);
        s = "8";

        for ( z=0;z < m; z++)
        {
            System.out.println(s);
        }

    }
}
