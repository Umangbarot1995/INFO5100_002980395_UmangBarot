// package org.example;

public class Square extends Shape{
    public Square(double height, double width) {
        super(height, width);
    }

    public double calculateArea()
    {
        return getHeight() * getWidth();
    }
}
