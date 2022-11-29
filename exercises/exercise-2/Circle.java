// package org.example;

public class Circle extends Shape{
    public static String color = "Green";

    public Circle(double height, double width) {
        super(height, width);
    }

    public double calculateArea()
    {
        return getHeight() * getWidth();
    }
}
