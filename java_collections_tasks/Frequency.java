package java_collections_tasks;

//task 3.2

import java.util.*;
public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "hello";
	        Map<Character, Integer> freqMap = new HashMap<>();

	        for (char ch : input.toCharArray())
	        {
	            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
	        }

	        System.out.println(freqMap);
	}

}

        
