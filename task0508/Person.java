package com.javarush.task.task05.task0508;

/* 
Геттеры и сеттеры для класса Person
*/

public class Person {
    String name;
    int age;
    char sex;//напишите тут ваш код

    public static void main(String[] args) {

    }
    public java.lang.String getName() {
        return name;
    }
    public void setName(String name)
    { this.name = name;}
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSex(char sex)
    { this.sex = sex;}
    public char getSex()
    {return sex;}
}