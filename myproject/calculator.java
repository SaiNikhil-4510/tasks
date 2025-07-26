package myproject;

//task 8.1 

import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner input = new Scanner(System.in);
		        System.out.print("Enter first number: ");
		        int a = input.nextInt();
		        System.out.print("Enter second number: ");
		        int b = input.nextInt();
		        int add= a + b;
		        int sub = a - b;
		        int mul = a * b;
		        int div= a / b;
		        System.out.println("\nArithmetic Operations:");
		        System.out.println("add: " + add);
		        System.out.println("sub: " + sub);
		        System.out.println("mul: " + mul);
		        System.out.println("div: " + div);
		        // Assignment operators
		        int x = a;
		        x += b;
		        System.out.println("\nAfter x += b: " + x);

		        x = a;
		        x -= b;
		        System.out.println("After x -= b: " + x);

		        x = a;
		        x *= b;
		        System.out.println("After x *= b: " + x);

		        x = a;
		        x /= b;
		        System.out.println("After x /= b: " + x);

		    }
		}

	


