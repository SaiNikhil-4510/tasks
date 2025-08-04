package java_collections_tasks;

//task 7.2

import java.util.*;

public class FrequencyCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> languages = Arrays.asList("Java", "Python", "Java", "C++", "JavaScript", "Java", "Ruby" );
	        int count = Collections.frequency(languages, "Java");
	        System.out.println("The word 'Java' appears " + count + " times in the list.");
	}

}

