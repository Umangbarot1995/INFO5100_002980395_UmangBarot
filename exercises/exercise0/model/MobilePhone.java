package model;

public class MobilePhone {
    private int id;
    private String manufacturer;
    private String model;
    private String color;
    private String processor;
    private String os;
    private float screensize;
    private int price;

    public MobilePhone(int id, String manufacturer, String model, String color, String processor, String os,
            float screensize, int price) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.processor = processor;
        this.os = os;
        this.screensize = screensize;
        this.price = price;

        System.out.println("Created instance of class MobilePhone for id: " + id + " and model: " + model);
    }

    public int getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getProcessor() {
        return processor;
    }

    public String getOs() {
        return os;
    }

    public float getScreensize() {
        return screensize;
    }

    public int getPrice() {
        return price;
    }

    public int getid() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}