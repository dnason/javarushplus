package com.javarush.task.task05.task0514;

/* 
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {

        Person person = new Person();
        person.initialize("abc",5);
}
    static class Person {
        int age;
        String name;
        public void initialize(String name, int age)
        {this.name = name;
            this.age= age;
        }}

        //напишите тут ваш код
    }

