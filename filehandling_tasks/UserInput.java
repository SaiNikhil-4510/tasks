package filehandling_tasks;

//task 6

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();
        
        try {
            FileWriter writer = new FileWriter("UserInput.txt");
            writer.write(name + "\n");
            writer.write(email + "\n");
            writer.write(address + "\n");
            writer.close();
            System.out.println("User data successfully saved to UserInput.txt.");
        } 
        catch (IOException e)
        {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        //scanner.close();
    }
}
