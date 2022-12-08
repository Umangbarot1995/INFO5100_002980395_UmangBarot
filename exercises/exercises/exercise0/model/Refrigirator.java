package model;

public class Refrigirator {
    private int id;
    private int length;
    private int width;
    private String brand;
    private int noofDoors;
    private int capacity;
    private boolean isSmart;
    private int height;

    public Refrigirator(int id, int length, int width, String brand, int noofDoors, int capacity, boolean isSmart,
            int height) {
        this.id = id;
        this.length = length;
        this.width = width;
        this.brand = brand;
        this.noofDoors = noofDoors;
        this.capacity = capacity;
        this.isSmart = isSmart;
        this.height = height;

        System.out.println("Created instance of class Refrigirator for id: " + id + " and brand: " + brand);
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

    public int getNoofDoors() {
        return noofDoors;
    }

    public int getcapacity() {
        return capacity;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public int getHeight() {
        return height;
    }
}
