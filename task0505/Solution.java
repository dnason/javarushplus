package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Vasya",2,9, 5); //напишите тут ваш код
        Cat cat2 = new Cat("Motya",5,8,6);
        Cat cat3 = new Cat("Pipi", 3,10,7 );

        System.out.println("Победит ли Вася ? " + cat1.fight(cat2));
        System.out.println("Победит ли Мотя ? " + cat2.fight(cat3));
        System.out.println("Победит Пипи ? " + cat3.fight(cat1));


    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
