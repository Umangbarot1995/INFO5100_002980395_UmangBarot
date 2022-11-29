// package org.example;

public class Triangle extends Shape{
    public Triangle(double height, double width) {
        super(height, width);
    }

    public double calculateArea() {
        return (getWidth() * getHeight()) / 2;
    }
}
