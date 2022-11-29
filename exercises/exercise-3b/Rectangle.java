public class Rectangle extends Shape {
    public Rectangle(double height, double width) {
        super(height, width);
    }

    public double calculateArea() {
        return getHeight() * getWidth();
    }
}
