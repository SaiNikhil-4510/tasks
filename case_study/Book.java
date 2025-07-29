package case_study;

// book details

public class Book extends Product {
    private String author;
    private String genre;

    public Book(String id, String name, double price, int stock, String author, String genre) {
        super(id, name, price, stock);
        this.author = author;
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book: " + name + " | Author: " + author + " | Genre: " + genre + " | Price: ₹" + price + " | Stock: " + stock);
    }
}