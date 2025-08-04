package filehandling_tasks;

//task 12

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        // Reverse the input text
        String reversed = new StringBuilder(input).reverse().toString();

        // Display the result
        System.out.println("Reversed text: " + reversed);

        scanner.close();
    }
}
