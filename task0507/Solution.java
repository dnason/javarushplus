package com.javarush.task.task05.task0507;
import java.io.*;

/* 
Среднее арифметическое
*/


public class Solution {
    public static void main(String[] args) throws Exception {
               BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                double summ = 0;
                int n=0;
                while (true) {
                    int a = Integer.parseInt(reader.readLine());
                    if (a == -1){
                        summ += a;
                        break;
                    }
                    summ += a;
                    n++;
                }
                summ=(summ+1)/n;
                System.out.println(summ);
            }
        }