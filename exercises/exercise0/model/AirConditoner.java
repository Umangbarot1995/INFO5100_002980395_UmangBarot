package model;

public class AirConditoner {
    private int id;
    private int length;
    private int width;
    private String brand;
    private String type;
    private double coolingCapacity;
    private boolean isSmart;
    private String color;

    public AirConditoner(int id, int length, int width, String brand, String type, double coolingCapacity, boolean isSmart,
            String color) {
        this.id = id;
        this.length = length;
        this.width = width;
        this.brand = brand;
        this.type = type;
        this.coolingCapacity = coolingCapacity;
        this.isSmart = isSmart;
        this.color = color;

        System.out.println("Created instance of class AirConditoner for id: " + id);
    }

    public int getId() {
        return id;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public double getCoolingCapacity() {
        return coolingCapacity;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public String getColor() {
        return color;
    }
}
