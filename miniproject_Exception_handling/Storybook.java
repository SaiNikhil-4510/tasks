package miniproject_Exception_handling;


public class Storybook extends Book {
    public Storybook(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public void displayInfo() {
        System.out.println("Storybook: " + title + " by " + author + " [ID: " + id + "]");
    }
}
