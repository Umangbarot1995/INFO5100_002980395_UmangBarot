
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        // Abstraction, Overriding, Polymorphism, static field
        double width = 20;
        double height = 6;

        // Serialization
       try {
           // Creating the object
           Shape shape1 = new Triangle(height, width);
           System.out.println("Triangle area: " + shape1.calculateArea());
           // Creating stream and writing the object
           FileOutputStream fout = new FileOutputStream("triangle.txt");
           ObjectOutputStream out = new ObjectOutputStream(fout);
           out.writeObject(shape1);
           out.flush();
           // closing the stream
           out.close();
           System.out.println("success");
       } catch (Exception e) {
           System.out.println(e);
       }

       try {
           // Creating the object
           Shape shape2 = new Rectangle(height, width);
           System.out.println("Rectangle area: " + shape2.calculateArea());
           // Creating stream and writing the object
           FileOutputStream fout = new FileOutputStream("rectangle.txt");
           ObjectOutputStream out = new ObjectOutputStream(fout);
           out.writeObject(shape2);
           out.flush();
           // closing the stream
           out.close();
           System.out.println("success");
       } catch (Exception e) {
           System.out.println(e);
       }

        try {
            // Creating the object
            Shape shape3 = new Circle(height, width);
            System.out.println("Circle area: " + shape3.calculateArea());
            if (shape3 instanceof Circle) {
                System.out.println("Circle color: " + ((Circle) shape3).color);
            }
            // Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("circle.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(shape3);
            out.flush();
            // closing the stream
            out.close();
            System.out.println("success");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            // Creating the object
            Shape shape4 = new Square(height, width);
            System.out.println("Square area: " + shape4.calculateArea());
            // Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("square.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(shape4);
            out.flush();
            // closing the stream
            out.close();
            System.out.println("success");
        } catch (Exception e) {
            System.out.println(e);
        }

        // Deseirilization
       try {
           // Creating stream to read the object
           ObjectInputStream in = new ObjectInputStream(new FileInputStream("triangle.txt"));
           Shape shape1 = (Triangle) in.readObject();
           // printing the data of the serialized object
           System.out.println(shape1.calculateArea());
           // closing the stream
           in.close();
       } catch (Exception e) {
           System.out.println(e);
       }

       try {
           // Creating stream to read the object
           ObjectInputStream in = new ObjectInputStream(new FileInputStream("rectangle.txt"));
           Shape shape2 = (Rectangle) in.readObject();
           // printing the data of the serialized object
           System.out.println(shape2.calculateArea());
           // closing the stream
           in.close();
       } catch (Exception e) {
           System.out.println(e);
       }

       try {
           // Creating stream to read the object
           ObjectInputStream in = new ObjectInputStream(new FileInputStream("circle.txt"));
           Shape shape3 = (Circle) in.readObject();
           // printing the data of the serialized object
           System.out.println(shape3.calculateArea());
           // closing the stream
           in.close();
       } catch (Exception e) {
           System.out.println(e);
       }

       try {
           // Creating stream to read the object
           ObjectInputStream in = new ObjectInputStream(new FileInputStream("square.txt"));
           Shape shape4 = (Square) in.readObject();
           // printing the data of the serialized object
           System.out.println(shape4.calculateArea());
           // closing the stream
           in.close();
       } catch (Exception e) {
           System.out.println(e);
       }

    }
}