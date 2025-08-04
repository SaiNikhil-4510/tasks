package java_collections_tasks;

// task 5.1

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> 
{
    String name;
    int marks;
    
    public Student(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }
    @Override
    public int compareTo(Student other)
    {
        return Integer.compare(this.marks, other.marks);
    }
    @Override
    public String toString()
    {
        return name + ": " + marks;
    }
}

public class StudentSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>();
        students.add(new Student("Nikhil", 80));
        students.add(new Student("Rakesh", 75));
        students.add(new Student("Mizba", 63));
        students.add(new Student("Tarun", 78));
        
        Collections.sort(students);
        System.out.println("Students sorted by marks (ascending):");
        for (Student student : students) 
        {
            System.out.println(student);
	    }

     }
}


