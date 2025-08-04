package java_collections_tasks;

//task 2.1

import java.util.*;
public class SetProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<String> languages = new HashSet<>();

	        // Add strings including duplicates
	        languages.add("Nikhil");
	        languages.add("Rohith");
	        languages.add("Anil");
	        languages.add("Nikhil");   // duplicate
	        languages.add("Rohith"); // duplicate

	        // Print the set
	        System.out.println("Contents of the HashSet: " + languages);
	}

} 

        
