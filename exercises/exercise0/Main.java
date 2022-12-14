import model.*;

public class Main {
  public static void main(String[] args) {

    AirConditoner ac1 = new AirConditoner(1, 890, 285, "Samsung", "Split AC", 0.5, true, "White");
    AirConditoner ac2 = new AirConditoner(2, 910, 235, "LG", "Split AC", 3, true, "White");
    AirConditoner ac3 = new AirConditoner(3, 850, 295, "Sony", "Window AC", 5, false, "orange");

    System.out.println();

    Book b1 = new Book(1, "Harry Potter", "J.K. Rowling", "Bloomsburry", 800, true, 20, "1997");
    Book b2 = new Book(2, "I am number four", "Jobie Hughes, James Frey", "HarperCollins ", 300, true, 20, "2009");
    Book b3 = new Book(3, "The Chronicles of Narnia", "C.S. Lewis", "HarperCollins", 1200, true, 25, "1950");

    System.out.println();
    
    Car c1 = new Car(1, "Porsche", "2023", "Cayenne", "Petrol", 3998, 5, "Automatic");
    Car c2 = new Car(2, "Bugatti", "2011", "Veyron", "Petrol", 7993, 2, "Automatic");
    Car c3 = new Car(3, "McLaren", "2022", "720S", "Petrol", 3994, 2, "Automatic");

    System.out.println();
    
    // Nested Class
    Car.Engine e1 = c1.new Engine("V-6", 3.0, 335, 5300, 332, 1340, 4, 19);
    Car.Engine e2 = c1.new Engine("V-4", 2.0, 250, 3400, 244, 980, 2, 14);
    Car.Engine e3 = c1.new Engine("V-8", 7.0, 975, 7500, 572, 1790, 4, 23);

    System.out.println();
    
    Car.Body bo1 = c1.new Body(1, 178.9, 76, 47.1, 105.1, 4.2, 3139, 5730);
    Car.Body bo2 = c1.new Body(2, 193.7, 78.1, 66.8, 102, 5.6, 2875, 3845);
    Car.Body bo3 = c1.new Body(3, 155.5, 69, 43.7, 103.5, 4.8, 3124, 6780);

    System.out.println();
    
    Chair ch1 = new Chair(1, 35, 16, "Ikea", "Wood", false, false, false);
    Chair ch2 = new Chair(2, 37, 14, "Ikea", "Synteic Foam", false, true, true);
    Chair ch3 = new Chair(3, 33, 17, "Ikea", "Synteic Foam", true, true, true);

    System.out.println();
    
    House h1 = new House(1, 2, 2, 1, false, 28, true, "Town House");
    House h2 = new House(2, 3, 2, 1, true, 28, false, "Town House");
    House h3 = new House(3, 5, 4, 3, true, 28, true, "Town House");

    System.out.println();
    
    Laptop lap1 = new Laptop(1, "Apple", "Macbook Pro", "Silver", "M1 Chip", "MAC OS", 14.2f, 2499);
    Laptop lap2 = new Laptop(2, "Apple", "Macbook", "Gold", "M3 Chip", "MAC OS", 15.6f, 2000);
    Laptop lap3 = new Laptop(3, "Microsoft", "Surface Pro", "Gold", "Intel Core i5 Processor", "Windows", 14.4f, 1599);

    System.out.println();
    
    MobilePhone mp1 = new MobilePhone(1, "Apple", "Iphone 14 Pro", "Deep Purple", "A16 Bionic Chip", "Ios", 6.12f, 999);
    MobilePhone mp2 = new MobilePhone(2, "Google", "Pixel 7", "Gold", "Google Tensor G2", "Android", 6.5f, 809);
    MobilePhone mp3 = new MobilePhone(3, "Apple", "Iphone 13 Pro Max", "Blue", "A15 Bionic Chip", "Ios", 6.68f, 999);

    System.out.println();
    
    Refrigirator r1 = new Refrigirator(1, 33, 30, "Samsung", 2, 200, false, 67);
    Refrigirator r2 = new Refrigirator(2, 34, 32, "Samsung", 2, 200, true, 67);
    Refrigirator r3 = new Refrigirator(3, 35, 33, "LG", 4, 300, true, 67);

    System.out.println();
    
    Table t1 = new Table(1, 47, 23, "FDW", "Wood", 2, false, 29);
    Table t2 = new Table(2, 54, 27, "FlexiSpot", "Wood", 2, true, 45);
    Table t3 = new Table(3, 45, 25, "Ikea", "Wood", 4, false, 29);

    System.out.println();
    
    WashingMachine w1 = new WashingMachine(1, 27, 32, "Samsung", "Front Load", 6, false, 38);
    WashingMachine w2 = new WashingMachine(2, 26, 33, "Samsung", "Top Load", 4, false, 35);
    WashingMachine w3 = new WashingMachine(3, 25, 32, "Samsung", "Front Load", 10, true, 42);

  }
}
