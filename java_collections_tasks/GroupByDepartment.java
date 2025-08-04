package java_collections_tasks;

//task 5.3

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee
{
    String name;
    String department;

    public Employee(String name, String department)
    {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() 
    {
        return name;
    }
}

public class GroupByDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Anil", "HR"));
        employees.add(new Employee("Nikhil", "IT"));
        employees.add(new Employee("Charan", "HR"));
        employees.add(new Employee("Dinesh", "Finance"));
        employees.add(new Employee("Rohith", "IT"));

        Map<String, List<Employee>> groupedByDept = new HashMap<>();

        for (Employee emp : employees)
        {
            groupedByDept
                .computeIfAbsent(emp.department, k -> new ArrayList<>())
                .add(emp);
        }

        for (Map.Entry<String, List<Employee>> entry : groupedByDept.entrySet())
        {
            System.out.println("Department: " + entry.getKey());
            System.out.println("Employees: " + entry.getValue());
            System.out.println();
        }
	}

}


        