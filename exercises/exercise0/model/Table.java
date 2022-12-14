package model;

public class Table {
    private int id;
    private int length;
    private int width;
    private String brand;
    private String material;
    private int noofLegs;
    private boolean isAdjustable;
    private int height;

    public Table(int id, int length, int width, String brand, String material, int noofLegs, boolean isAdjustable,
            int height) {
        this.id = id;
        this.length = length;
        this.width = width;
        this.brand = brand;
        this.material = material;
        this.noofLegs = noofLegs;
        this.isAdjustable = isAdjustable;
        this.height = height;

        System.out.println("Created instance of class Table for id: " + id + " and brand: " + brand);
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

    public String getMaterial() {
        return material;
    }

    public int getNoofLegs() {
        return noofLegs;
    }

    public boolean isAdjustable() {
        return isAdjustable;
    }

    public int getHeight() {
        return height;
    }
}
