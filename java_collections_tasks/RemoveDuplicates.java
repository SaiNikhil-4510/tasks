package java_collections_tasks;

//task 1.3

import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listWithDuplicates = Arrays.asList("Java", "C", "Java", "Python");
		System.out.println(listWithDuplicates);
	
        Set<String> uniqueSet = new LinkedHashSet<>(listWithDuplicates);

        List<String> listWithoutDuplicates = new ArrayList<>(uniqueSet);

        System.out.println(listWithoutDuplicates);
	}

}
