package filehandling_tasks;

//task 13

import java.io.*;

public class ReplaceWordsInFile {
    public static void main(String[] args) {
        String inputFile = "data.txt";
        String outputFile = "output.txt";

        // Create data.txt if it doesn't exist
        File file = new File(inputFile);
        if (!file.exists()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
                writer.write("Java is a powerful language.\nMany programmers love Java.");
                System.out.println("Created sample data.txt file.");
            } catch (IOException e) {
                System.out.println("Error creating file: " + e.getMessage());
                return;
            }
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String modifiedLine = line.replaceAll("Java", "Python");
                writer.write(modifiedLine);
                writer.newLine();
            }

            System.out.println("Replacement complete. Check output.txt for results.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

