package myproject;

//task 9.4

import java.util.Scanner;

public class positive_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a positive number (-1 to stop): ");
            number = scanner.nextInt();

            if (number >= 0) {
                System.out.println("You entered: " + number);
            } else if (number != -1) {
                System.out.println("Please enter a positive number.");
            }

        } while (number != -1);

        System.out.println("Program ended.");
        scanner.close();
	}

}



        
