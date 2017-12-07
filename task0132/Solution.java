package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int x=number%100;
        int x1=(number-x)/100;
        int y=x%10;
        int y1=(x-y)/10;
        int z=number-(x1*100)-(y1*10);
        return x1+y1+z;
        
    }
}