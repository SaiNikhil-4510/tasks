package java_collections_tasks;

//task 3.3

import java.util.*;
public class SortMapByKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        HashMap<Integer, String> unsortedMap = new HashMap<>();
        unsortedMap.put(105, "Nikhil");
        unsortedMap.put(102, "Babu");
        unsortedMap.put(104, "Anil");
        unsortedMap.put(101, "Akki");
        unsortedMap.put(103, "Rohith");

        TreeMap<Integer, String> sortedMap = new TreeMap<>(unsortedMap);

        System.out.println("Sorted Map (by keys):");
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) 
        {
            System.out.println("Roll No: " + entry.getKey() + " - Name: " + entry.getValue());
        }
	}

}

      
