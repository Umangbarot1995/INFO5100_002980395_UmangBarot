package model;

public class Laptop {
  private int id;
  private String manufacturer;
  private String model;
  private String color;
  private String processor;
  private String os;
  private float screensize;
  private int price;

  public Laptop(int id, String manufacturer, String model, String color, String processor, String os,
          float screensize, int price) {
      this.id = id;
      this.manufacturer = manufacturer;
      this.model = model;
      this.color = color;
      this.processor = processor;
      this.os = os;
      this.screensize = screensize;
      this.price = price;

      System.out.println("Created instance of class Laptop for id: " + id + " and model: " + model);
  }

  public int getId() {
    return id;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public String getModel() {
    return model;
  }

  public String getColor() {
    return color;
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

}
