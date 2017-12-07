package com.javarush.task.task06.task0601;

/* 
Метод finalize класса Cat
*/

public class Cat {
    String name;
    Cat cat1 = new Cat();
    {this.name = name;}

    protected void finalize() throws Throwable
    {
        System.out.println("1");
      }
    public static void main(String[] args) {

    }
}
