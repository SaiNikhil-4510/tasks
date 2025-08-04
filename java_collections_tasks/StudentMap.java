package java_collections_tasks;

//task 3.1

import java.util.*;
public class StudentMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101, "Nikhil");
        studentMap.put(102, "Anil");
        studentMap.put(103, "Akki");
        studentMap.put(104, "Nitish");
        studentMap.put(105, "Rohith");

        studentMap.remove(103);

        // Iterate using entrySet
        System.out.println("Student Roll Numbers and Names:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + " - Name: " + entry.getValue());
        }
	}

}

       
