package java_oops_tasks;
//task 2
class emp 
{
	 static int count = 0;
	 String name;
	 emp(String name)
	 {
	 this.name = name;
	 count++; 
	 }
	 void display()
	 {
	 System.out.println("Employee Name: " + name);
	 }
	 static void displayCount()
	 {
	 System.out.println("Total Employees: " + count);
	 }
}
	public class Employee {
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
	 emp e1 = new emp("Nikhil");
	 emp e2 = new emp("Anil");
	 emp e3 = new emp("Rohith");
	 e1.display();
	 e2.display();
	 e3.display();
	 emp.displayCount(); 
	 }
	}



