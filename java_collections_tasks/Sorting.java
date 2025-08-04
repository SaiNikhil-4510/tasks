package java_collections_tasks;

//task 1.2 

import java.util.*;
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        List<Integer> numbers = Arrays.asList(10, 7, 20, 3, 5, 6);

        List<Integer> asc = new ArrayList<>(numbers);
        Collections.sort(asc);
        System.out.println("Ascending Order: " + asc);

        List<Integer> desc = new ArrayList<>(numbers);
        Collections.sort(desc, Collections.reverseOrder());
        System.out.println("Descending Order: " + desc);
	}

}

