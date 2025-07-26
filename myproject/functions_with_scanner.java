package myproject;
import java.util.Scanner;
public class functions_with_scanner {

	static int addition(int x , int y)
	{
		int result = x+y;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1;
		 num1= sc.nextInt();
		System.out.println("Enter num2: ");
		int num2;
	    num2= sc.nextInt();
		int result= addition(num1 , num2);
		System.out.println("sum of the two numbers are : " + result);
		
	}

}
