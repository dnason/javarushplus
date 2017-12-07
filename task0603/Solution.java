package com.javarush.task.task06.task0603;

/* 
По 50 000 объектов Cat и Dog
*/

public class Solution {
    public static void main(String[] args) {
        int n=50000;
        while (n !=0)
        {   n--;
            Cat cat = new Cat(); }

        n=50000;
        while (n !=0 )
        {
        n--;
        Dog dog = new Dog();
        }
    }
    }


class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Dog was destroyed");
    }
}
