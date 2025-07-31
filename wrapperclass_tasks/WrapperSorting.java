package wrapperclass_tasks;

//task 10 wrapper sorting 

import java.util.Arrays;
public class WrapperSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Integer[] numbers = {60, 42, 56, 90, 88, 70};
        Arrays.sort(numbers);
        int secondHighest = numbers[numbers.length - 2];

        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.println("Second highest value: " + secondHighest);
	}

}
