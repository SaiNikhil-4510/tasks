package java_collections_tasks;

//task 2.2

import java.util.*;
public class SortedSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> numbers = new TreeSet<>();

        // Add integers to the TreeSet
        numbers.add(40);
        numbers.add(80);
        numbers.add(30);
        numbers.add(10);
        numbers.add(50);

        // TreeSet automatically keeps elements sorted
        System.out.println("Sorted numbers: " + numbers);
	}

}

        
