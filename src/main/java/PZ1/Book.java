package PZ1;

public class Book {
    private String title;
    private String author;
    private int pages;
    private double price;

    public Book(String title, String author, int pages, double price){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }
    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.pages = 0;
        this.price = 0.0;
    }
    public void displayInfo(){
        System.out.printf("Title: %s" +
                        "\nAuthor: %s" +
                        "\nPages: %d" +
                        "\nPrice: $%.2f\n",
                title, author, pages, price);
    }
    public double applyDiscount(double discount){
        return price -= price * discount / 100;
    }
}

