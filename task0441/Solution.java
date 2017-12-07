package com.javarush.task.task04.task0441;


/*
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
                int a=Integer.parseInt(new BufferedReader( new InputStreamReader(System.in)).readLine());
                int b=Integer.parseInt(new BufferedReader( new InputStreamReader(System.in)).readLine());
                int c=Integer.parseInt(new BufferedReader( new InputStreamReader(System.in)).readLine());

                System.out.println((a+b+c)-max(max(a, b), c) - min(min(a, b), c));
            }
            static int max(int a, int b){
                if (a>=b) return a;
                else return b;
            }
            static int min(int a, int b){
                if (a<=b) return a;
                else return b;
            }
        }