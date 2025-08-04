package java_collections_tasks;

//task 6.1

import java.util.*;
import java.util.stream.Collectors;

public class FilterElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> names = Arrays.asList("John", "Rahul", "Jack", "Jadeja", "Gill", "Pant");

	        List<String> filteredNames = names.stream()
	                .filter(name -> name.startsWith("J"))
	                .collect(Collectors.toList());

	        System.out.println("Names starting with 'J': " + filteredNames);
	}

}
