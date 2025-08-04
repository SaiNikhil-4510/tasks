package java_collections_tasks;

//task 6.3

import java.util.*;
import java.util.stream.Collectors;

class MyEmployee
{
    private String id;
    private String name;
    private String department;

    public MyEmployee(String id, String name, String department) 
    {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public String getDepartment()
    {
        return department;
    }

    @Override
    public String toString() 
    {
        return name + " (" + id + ")";
    }
}

public class GroupBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<MyEmployee> employees = Arrays.asList(
	            new MyEmployee("E101", "Alice", "Finance"),
	            new MyEmployee("E102", "Bob", "IT"),
	            new MyEmployee("E103", "Charlie", "Sales"),
	            new MyEmployee("E104", "Diana", "HR"),
	            new MyEmployee("E105", "Ethan", "IT")
	        );

	        Map<String, List<MyEmployee>> groupedByDept = employees.stream()
	            .collect(Collectors.groupingBy(MyEmployee::getDepartment));

	        groupedByDept.forEach((dept, empList) -> {
	            System.out.println("Department: " + dept);
	            empList.forEach(e -> System.out.println("  → " + e));
	        });
	}

}


       
