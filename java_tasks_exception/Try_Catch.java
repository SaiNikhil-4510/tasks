package java_tasks_exception;

//task 5.1
import java.util.Scanner;
public class Try_Catch 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        try 
        {
        	System.out.print("Enter a number to divide 100 by: ");
            int number = scanner.nextInt();
            int result = 100 / number;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException ex) 
        {
            System.out.println("Error: Cannot divide by zero!");
        }

      
	}

}


