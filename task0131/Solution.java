package com.javarush.task.task01.task0131;

/* 
Полнометражная картина
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }

    public static int getMetreFromCentimetre(int centimetre) {
        int answer,x=0;
        x=centimetre%100;
        answer=(centimetre-x)/100;
        return answer;//напишите тут ваш код
    }
}