package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int left,top,width,height;
    public void initialize(int left,int top, int width, int height)
    {   this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;}
    public void initialize(int left, int top )
    {   this.left=left;
        this.top=top;
        this.width=0;
        this.height=0;}
    public void initialize(int left,int width,int height)
    {   this.left = left;
        this.width = width;
        this.height = height;
        this.top = 0;}
    public void initialize(Rectangle rectangle)
    {   this.top = rectangle.top;
        this.width = rectangle.width;
        this.height = rectangle.height;
        this.left = rectangle.left;
    }

    public static void main(String[] args) {

    }
}
