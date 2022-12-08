package model;

public class House {
    private int id;
    private int noofBedroom;
    private int noofBathroom;
    private int noofFloor;
    private boolean isSmartHome;
    private int age;
    private boolean hasPatio;
    private String type;

    public House(int id, int noofBedroom, int noofBathroom, int noofFloor, boolean isSmartHome, int age,
            boolean hasPatio, String type) {
        this.id = id;
        this.noofBedroom = noofBedroom;
        this.noofBathroom = noofBathroom;
        this.noofFloor = noofFloor;
        this.isSmartHome = isSmartHome;
        this.age = age;
        this.hasPatio = hasPatio;
        this.type = type;

        System.out.println("Created instance of class House for id: " + id);
    }

    public int getId() {
        return id;
    }

    public int getNoofBedroom() {
        return noofBedroom;
    }

    public int getNoofBathroom() {
        return noofBathroom;
    }

    public int getNoofFloor() {
        return noofFloor;
    }

    public boolean isSmartHome() {
        return isSmartHome;
    }

    public int getAge() {
        return age;
    }

    public boolean isHasPatio() {
        return hasPatio;
    }

    public String getType() {
        return type;
    }
}
