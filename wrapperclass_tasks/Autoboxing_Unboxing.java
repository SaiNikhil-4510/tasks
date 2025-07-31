package wrapperclass_tasks;

// task 2  autoboxing and unboxing 

import java.util.ArrayList;
import java.util.List;
public class Autoboxing_Unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        List<Double> numbers = new ArrayList<>();

        numbers.add(20.5);  
        numbers.add(40.55);
        numbers.add(4.25);

        double sum = 0.0;
        for (Double num : numbers)
        {
            sum += num;  
        }

        double average = sum / numbers.size();
        
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average: " + average);
	}

}


