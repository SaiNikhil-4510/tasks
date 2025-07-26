package java_oops_tasks;

//task 1

 class Book {
   
    String title;
    String author;
    double price;

    void displayDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : ₹" + price);
    }
}
  
  public class Bookclass
  {
    public static void main(String[] args)
    {
    	// TODO Auto-generated method stub
        Book book1 = new Book();
        book1.title = "Biopic";
        book1.author = "Stephen";
        book1.price = 350.00;

       
        Book book2 = new Book();
        book2.title = "The Rise ";
        book2.author = "Alex";
        book2.price = 450.00;

        
        System.out.println("Book 1 Details:");
        book1.displayDetails();

        System.out.println("Book 2 Details:");
        book2.displayDetails();
    }
}
