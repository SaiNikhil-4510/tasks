package filehandling_tasks;

//task 8

import java.io.*;
import java.util.*;

public class ContactManager {
    private static final String FILE_NAME = "contacts.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nContact Manager");
            System.out.println("1. Add New Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) 
            {
            case 1:
                addContact(scanner);
                break;
            case 2:
                displayContacts();
                break;
            case 3:
                searchContact(scanner);
                break;
            case 4:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        scanner.close();
    }

    private static void addContact(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(new Contact(name, phone).toFileFormat());
            writer.newLine();
            System.out.println("Contact saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving contact.");
        }
    }

    private static void displayContacts() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\nAll Contacts:");
            while ((line = reader.readLine()) != null) {
                Contact.fromFileFormat(line).display();
            }
        } catch (IOException e) {
            System.out.println("Error reading contacts.");
        }
    }

    private static void searchContact(Scanner scanner) {
        System.out.print("Enter name to search: ");
        String searchName = scanner.nextLine().toLowerCase();
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Contact contact = Contact.fromFileFormat(line);
                if (contact.getName().toLowerCase().contains(searchName)) {
                    contact.display();
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Contact not found.");
            }
        } catch (IOException e) {
            System.out.println("Error searching contacts.");
        }
    }
}
