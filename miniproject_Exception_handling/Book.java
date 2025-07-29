package miniproject_Exception_handling;


public abstract class Book {
    protected String id;
    protected String title;
    protected String author;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public abstract void displayInfo();
}
