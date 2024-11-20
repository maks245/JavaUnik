package PZ1;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;

    // Default constructor
    public Car() {
        this("Unknown", "Unknown", 0, 0.0);
    }

    // Constructor with all parameters
    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;

    }

    // Constructor for model and brand
    public Car(String brand, String model) {
        this(brand, model, 0, 0.0);
    }

    public void displayInfo() {
        System.out.printf("Марка: %s%nМодель: %s%nРік випуску: %d%nЦіна: %.2f%n", brand, model, year, price);
    }
}
