package miniproject_oops;


import java.util.*;
import java.util.stream.Collectors;

public class StudentManagementApp {
    public static void main(String[] args) {
        Admin admin = new Admin("admin123");
        admin.login();

        List<Student> studentList = new ArrayList<>();

        // Add students
        studentList.add(new Student("Nikhil", 20, "S001", 85.5));
        studentList.add(new Student("Anil", 22, "S002", 91.0));
        studentList.add(new Student("Nitish", 19, "S003", 68.0));

        System.out.println("\nAll Students:");
        for (Student s : studentList) {
            s.printDetails();
            System.out.println("-------------------");
        }

        // 🔍 Lambda filter 
        System.out.println("\nStudents with grade > 80:");
        studentList.stream()
                   .filter(s -> s.getGrade() > 80)
                   .forEach(Student::printDetails);
    }
}
