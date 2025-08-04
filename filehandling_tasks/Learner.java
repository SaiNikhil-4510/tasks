package filehandling_tasks;

//task 10

import java.io.Serializable;

public class Learner implements Serializable {
    private int id;
    private String name;
    private double marks;

    public Learner(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}
