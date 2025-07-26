package myproject;
//task 10.1
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0, min, max;

        System.out.println("Enter 10 integers:");

        // Read values and calculate sum
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
            sum += arr[i];
        }

        // Set initial min and max values
        min = arr[0];
        max = arr[0];

        // Find min and max
        for (int i = 1; i < 10; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        // Calculate average
        double average = (double) sum / 10;

        // Display results
        System.out.println("\nAverage: " + average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

       
    }
}


