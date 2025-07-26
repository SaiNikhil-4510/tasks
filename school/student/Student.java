
package com.school.student;
//task 4.1

public class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber);
    }
}
