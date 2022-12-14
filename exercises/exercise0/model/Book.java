package model;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int noofPages;
    private boolean hasManyParts;
    private double price;
    private String releaseYear;

    public Book(int id, String name, String author, String publisher, int noofPages, boolean hasManyParts, double price,
    String releaseYear) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.noofPages = noofPages;
        this.hasManyParts = hasManyParts;
        this.price = price;
        this.releaseYear = releaseYear;

        System.out.println("Created instance of class Book for id: " + id + " and name: " + name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getNoofPages() {
        return noofPages;
    }

    public boolean isHasManyParts() {
        return hasManyParts;
    }

    public double getPrice() {
        return price;
    }

    public String getReleaseYear() {
        return releaseYear;
    }
}
