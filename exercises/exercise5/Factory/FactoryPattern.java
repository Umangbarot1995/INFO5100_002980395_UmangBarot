package Factory;

public class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
  
        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("DOOR");
  
        //call draw method of Circle
        shape1.assemble();
  
        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("ENGINE");
  
        //call draw method of Rectangle
        shape2.assemble();
  
        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("BATTERY");
  
        //call draw method of square
        shape3.assemble();
     }
}
