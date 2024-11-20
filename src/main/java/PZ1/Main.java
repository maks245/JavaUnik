package PZ1;

public class Main {
    public static void main(String[] args) {
        // Task 1
        Book book1 = new Book("Дон Кіхот", "Сервантес", 500, 15.99);
        Book book2 = new Book("1984", "Джордж Орвелл");

        book1.displayInfo();
        System.out.println();
        book2.displayInfo();

        book1.applyDiscount(20);
        System.out.println("\nПісля знижки:" + book1.applyDiscount(20));
        book1.displayInfo();
        // Task 2
        Student student = new Student();
        student.setName("Іван Петров");
        student.setAge(20);
        student.setGpa(3.5);

        student.printStudentInfo();

        // Task 3
        Car car1 = new Car();
        Car car2 = new Car("Toyota", "Camry", 2022, 25000.0);
        Car car3 = new Car("Tesla", "Model 3");

        car1.displayInfo();
        System.out.println();
        car2.displayInfo();
        System.out.println();
        car3.displayInfo();

        // Task 4
        Circle circle = new Circle(5);

        double area = circle.calculateArea();
        double circumference = circle.calculateCircumference();

        System.out.println("Площа кола: " + area);
        System.out.println("Довжина кола: " + circumference);

        // Task 5
        BankAccount.setBankName("ПриватБанк");

        BankAccount account1 = new BankAccount("UA1234567890", 1000);
        BankAccount account2 = new BankAccount("UA9876543210", 500);

        account1.deposit(500);
        account2.withdraw(200);

        account1.displayAccountInfo();
        System.out.println();
        account2.displayAccountInfo();

        // Task 6

        LibraryBook libraryBook1 = new LibraryBook("Гаррі Поттер", "Дж. К. Роулінг");
        LibraryBook libraryBook2 = new LibraryBook("Володар Перснів", "Дж. Р. Р. Толкін");
        LibraryBook libraryBook3 = new LibraryBook("1984", "Джордж Орвелл");

        libraryBook1.displayBookInfo();
        System.out.println();
        libraryBook2.displayBookInfo();
        System.out.println();
        libraryBook3.displayBookInfo();
        System.out.println();

        System.out.println("Загальна кількість книг: " + LibraryBook.getTotalBooks());
    }
}
