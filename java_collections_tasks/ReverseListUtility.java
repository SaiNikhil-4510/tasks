package java_collections_tasks;

//task 7.1

import java.util.*;
public class ReverseListUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>(Arrays.asList("Anil", "Bhagavan", "Charan", "Dinesh"));
        System.out.println("Original list: " + names);
        Collections.reverse(names);
        System.out.println("Reversed list: " + names);
	}

}

        
