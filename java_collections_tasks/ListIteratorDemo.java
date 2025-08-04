package java_collections_tasks;

//task 4.2

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> list = new ArrayList<>();
	        list.add("Anil");
	        list.add("Babu");
	        list.add("Charan");
	        list.add("Dinesh");

	        ListIterator<String> iterator = list.listIterator();

	        System.out.println("Forward Traversal:");
	        while (iterator.hasNext())
	        {
	            System.out.println(iterator.next());
	        }
 
	        System.out.println("\nBackward Traversal:");
	        while (iterator.hasPrevious()) {
	            System.out.println(iterator.previous());
	}

}
}

        