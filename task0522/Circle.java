package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle()
    { x=0;
      y=0;
      radius=0;};

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Circle(double x)
    {this.x=x;
    this.y=2;
    this.radius=32;}

    public Circle(double x,double y)
    {this.x = x;
    this.y=y;
    this.radius=2;}
    public static void main(String[] args) {

    }
}