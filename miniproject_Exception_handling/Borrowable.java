package miniproject_Exception_handling;


public interface Borrowable {
    int MAX_DAYS = 14;

    boolean borrow(String bookId);

    default String returnPolicy() {
        return "Books must be returned within " + MAX_DAYS + " days.";
    }
}
