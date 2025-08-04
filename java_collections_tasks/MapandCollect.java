package java_collections_tasks;

//task 6.2

import java.util.*;
import java.util.stream.Collectors;

public class MapandCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

	        List<Integer> squaredNumbers = numbers.stream()
	                .map(n -> n * n)
	                .collect(Collectors.toList());

	        System.out.println("Squared numbers: " + squaredNumbers);
	}

}

