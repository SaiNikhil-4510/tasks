package service;
//task 9

import Model.Student;
import java.util.ArrayList;
import java.util.List;

public class Studentservice {
    private final List<Student> store = new ArrayList<>();

    public void save(Student s) {
        store.add(s);
    }

    public List<Student> getAll() {
        return new ArrayList<>(store);
    }

    public void printAll() {
        System.out.println("All students:");
        for (Student s : store) {
            System.out.println(" - " + s);
        }
    }
}