package Factory;

public class ShapeFactory {
    // use getShape method to get object of type shape
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("DOOR")) {
            return new Door();
        } else if (shapeType.equalsIgnoreCase("ENGINE")) {
            return new Engine();
        } else if (shapeType.equalsIgnoreCase("BATTERY")) {
            return new Battery();
        }
        return null;
    }
}
