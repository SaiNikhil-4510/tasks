package miniproject_Exception_handling;


import miniproject_Exception_handling.Book.*;
import miniproject_Exception_handling.User.*;

public class LibraryApp {
    public static void main(String[] args) {
        User user = new User("Nikhil");
        user.showLibraryInfo();

        Book book = new Storybook("101", "The Falcons", "Avengers");
        book.displayInfo();

        try {
            boolean success = user.borrow(book.getId());
            if (!success) {
                throw new InvalidBookIdException("Invalid Book ID: " + book.getId());
            }
        } catch (InvalidBookIdException e) {
            System.out.println("🚫 Error: " + e.getMessage());
        }

        System.out.println(user.returnPolicy());
    }
}
