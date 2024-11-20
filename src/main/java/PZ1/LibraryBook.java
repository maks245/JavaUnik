package PZ1;

public class LibraryBook {
    private String title;
    private String author;
    private static int totalBooks;

    public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
        totalBooks++;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public void displayBookInfo() {
        System.out.println("Назва: " + title);
        System.out.println("Автор: " + author);
    }
}
