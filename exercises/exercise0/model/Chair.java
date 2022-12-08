package model;

public class Chair {
    private int id;
    private int length;
    private int width;
    private String brand;
    private String material;
    private boolean hasHeadRest;
    private boolean hasWheels;
    private boolean isAdjustable;

    public Chair(int id, int length, int width, String brand, String material, boolean hasHeadRest, boolean hasWheels,
            Boolean isAdjustable) {
        this.id = id;
        this.length = length;
        this.width = width;
        this.brand = brand;
        this.material = material;
        this.hasHeadRest = hasHeadRest;
        this.hasWheels = hasWheels;
        this.isAdjustable = isAdjustable;

        System.out.println("Created instance of class Chair for id: " + id);
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

    public boolean isHasHeadRest() {
        return hasHeadRest;
    }

    public boolean isHasWheels() {
        return hasWheels;
    }

    public boolean isAdjustable() {
        return isAdjustable;
    }
}
