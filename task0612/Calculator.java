package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
       int z=a+b;
       return z;
    }

    public static int minus(int a, int b) {
        int y=a-b;
        return y;
    }

    public static int multiply(int a, int b) {
        int z=a*b;
        return z;
    }

    public static double division(int a, int b) {
        double q=(double) a/b;
        return q;
    }

    public static double percent(int a, int b) {
      double w=(double)(a*b)/100;
        return w;
    }

    public static void main(String[] args) {

    }
}