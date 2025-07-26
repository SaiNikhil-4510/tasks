package Model;
//task 9
import Model.Student;
import service.Studentservice;

public class MainApp {
    public static void main(String[] args) {
        Studentservice service = new Studentservice();

        // Create and save students
        Student s1 = new Student("101", "Nikhil");
        Student s2 = new Student("102", "Anil");

        service.save(s1);
        service.save(s2);

        // Print via service
        service.printAll();
    }
}
