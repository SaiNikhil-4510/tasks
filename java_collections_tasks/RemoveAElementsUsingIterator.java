package java_collections_tasks;

//task 4.1

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveAElementsUsingIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        ArrayList<String> list = new ArrayList<>();
        list.add("Akki");
        list.add("Nikhil");
        list.add("Akhil");
        list.add("Charan");
        list.add("Anil");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.startsWith("A"))
            {
                iterator.remove(); 
            }
        }

        System.out.println("Updated List: " + list);
	}

}

        