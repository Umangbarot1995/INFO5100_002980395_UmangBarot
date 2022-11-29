// package org.example;

public class Main {
    public static void main(String[] args) {
        // Abstraction, Overriding, Polymorphism, static field
        double width = 11;
        double height = 7;
        Shape shape0 = new Triangle(height, width);
        Shape shape1 = new Rectangle(height, width);
        Shape shape3 = new Square(height, width);
        Shape shape2 = new Circle(height, width);
        System.out.println("Circle area: " + shape2.calculateArea());
        if (shape2 instanceof Circle) {
            System.out.println("Circle color: " +  ((Circle) shape2).color);
        }


        System.out.println("Triangle area: " + shape0.calculateArea());
        System.out.println("Rectangle area: " + shape1.calculateArea());
        System.out.println("Square area: " + shape3.calculateArea());
    }
}