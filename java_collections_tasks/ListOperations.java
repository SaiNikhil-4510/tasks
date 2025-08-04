package java_collections_tasks;

// task 1.1

import java.util.*;
public class ListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("C");
        languages.add("C++");
        languages.add("Ruby");
        languages.add("Python");

        languages.remove(1);

        System.out.println(languages);
	}

}


     