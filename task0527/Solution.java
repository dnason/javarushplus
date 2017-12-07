package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat ("Tom",35,32);
        Dog jimmyDog = new Dog ("Jimmy", 2 ,3);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Cat {
        String name;
        int height;
        int length;

        public Cat(String name, int height, int length) {
            this.name = name;
            this.height = height;
            this.length = length;
        }
    }
    public static class Dog {
            String name;
            int height;
            int length;
            public Dog(String name, int height, int length)
            {   this.name = name;
                this.height = height;
                this.length= length;}
        }
    }
