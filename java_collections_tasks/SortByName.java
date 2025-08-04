package java_collections_tasks;

// task 5.2

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1
{
 String name;
 int marks;
 public Student1(String name, int marks)
 {
     this.name = name;
     this.marks = marks;
 }
 @Override
 public String toString()
 {
     return name + ": " + marks;
 }
}
public class SortByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>();
        students.add(new Student("Nikhil", 72));
        students.add(new Student("Anil", 85));
        students.add(new Student("Mizba", 93));
        students.add(new Student("Tarun", 67));

        Collections.sort(students, new Comparator<Student>()
        {
            @Override
            public int compare(Student s1, Student s2)
            {
                return s1.name.compareTo(s2.name);
            }
        });

        // 🎯 Print sorted list
        System.out.println("Students sorted by name:");
        for (Student student : students) 
        {
            System.out.println(student);
        }
	}

}


