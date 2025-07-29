package miniproject_Exception_handling;

import miniproject_Exception_handling.Book;
import java.util.*;

public class User implements Borrowable {
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();

    public static final String LIBRARY_NAME = "City Central Library";
    public static final String LIBRARY_ADDRESS = "123 Book Street";

    public User(String name) {
        this.name = name;
    }

    @Override
    public boolean borrow(String bookId) {
        System.out.println(name + " borrowed book with ID: " + bookId);
        return true;
    }

    public void showLibraryInfo() {
        System.out.println("Library: " + LIBRARY_NAME);
        System.out.println("Address: " + LIBRARY_ADDRESS);
    }

    public String returnPolicy() {
        return Borrowable.super.returnPolicy();
    }
}
