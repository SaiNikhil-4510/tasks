package wrapperclass_tasks;

//task 6 working with array lists

import java.util.ArrayList;
import java.util.Collections;
public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(65);
        marks.add(92);
        marks.add(70);
        marks.add(85);
        marks.add(68);

        Integer minMark = Collections.min(marks);
        marks.remove(minMark);

        Integer maxMark = Collections.max(marks);//max
        Integer newMinMark = Collections.min(marks);//min
        double sum = 0;//for average
        
        for (Integer mark : marks)
        {
            sum += mark;
        }
        double average = sum / marks.size();

        System.out.println("Marks after removing the lowest: " + marks);
        System.out.println("Maximum mark: " + maxMark);
        System.out.println("Minimum mark: " + newMinMark);
        System.out.println("Average mark: " + average);
	}

}

        