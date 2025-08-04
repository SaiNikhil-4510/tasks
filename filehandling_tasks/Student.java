package filehandling_tasks;

//task 5

import java.io.Serializable;

public class Student implements Serializable 
{
    private String name;
    private int rollNo;
    private int marks;

    public Student(String name, int rollNo, int marks)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void displayInfo() 
    {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}
