package model;

public class WashingMachine {
    private int id;
    private int length;
    private int width;
    private String brand;
    private String loadType;
    private double capacity;
    private boolean isSmart;
    private int height;

    public WashingMachine(int id, int length, int width, String brand, String loadType, double capacity, boolean isSmart,
            int height) {
        this.id = id;
        this.length = length;
        this.width = width;
        this.brand = brand;
        this.loadType = loadType;
        this.isSmart = isSmart;
        this.capacity = capacity;
        this.height = height;

        System.out.println("Created instance of class WashingMachine for id: " + id + " and brand: " + brand);
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

    public String getLoadType() {
        return loadType;
    }

    public double getCapacity() {
        return capacity;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public int getHeight() {
        return height;
    }
    
}
