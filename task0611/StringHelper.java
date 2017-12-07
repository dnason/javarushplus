package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        int n=5;
        while (n !=0)
        {
            result=s+result;
            n--;
        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        while (count !=0)
        {   result=result+s;
            count--;}
            return result;
    }

    public static void main(String[] args) {

    }
}
