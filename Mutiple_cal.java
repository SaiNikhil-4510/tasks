package java_oops_tasks;

//task 6
class Calculator 
{
	 int add(int a,int b)
	 {
	 return a + b;
	 }
	 double add(double a,double b)
	 {
	 return a + b;
	 }
	 String add(String a,String b) 
	 {
	 return a + b;
	 }
}
	
public class Mutiple_cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		 System.out.println("Int Add: " + c.add(20, 10));
		 System.out.println("Double Add: " + c.add(2.5, 2.5));
		 System.out.println("String Add: " + c.add("Java", "Programming"));
	}

}
