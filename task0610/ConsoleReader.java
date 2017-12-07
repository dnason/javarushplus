package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {

    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        return number;
    }

    public static int readInt() throws Exception {
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String number2s = reader2.readLine();
        int number2 = Integer.parseInt(number2s);

        return number2;
        //напишите тут ваш код

    }

    public static double readDouble() throws Exception {
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        double number3 = Double.parseDouble(reader3.readLine().trim());
        return number3;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));

        boolean number4 = Boolean.parseBoolean(reader4.readLine());
        return number4;
    }

    public static void main(String[] args) {


    }
}
