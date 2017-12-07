package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //String  = reader.readline();
        //Cat cat1 = new Cat(cat1);


        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName);


        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, null);

        String sanName = reader.readLine();
        Cat catSan = new Cat(sanName, null, catMother );

        String childrenName = reader.readLine();
        Cat catChildren = new Cat(childrenName, catDaughter, catSan);

        String childrenName2 = reader.readLine();
        Cat catChildren2 = new Cat (childrenName2, catDaughter, catSan );

        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catDaughter);
        System.out.println(catSan);
        System.out.println(catChildren);
        System.out.println(catChildren2);
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }

        /*Cat(String name, Cat father) {
            this.name = name;
            this.father= father;
        }*/


        Cat(String name, Cat father, Cat mother)
        {   this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            if (mother == null && father == null)
                return "Cat name is " + name + ", no mother, no father ";
            if (mother != null && father == null)
                return "Cat name is " + name + ", mother is " + mother.name +", no father ";
            if (mother == null && father != null)
                return "Cat name is " + name + ", no mother, father is " + father.name ;
            else //if (mother != null && father != null)
                return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }

}
