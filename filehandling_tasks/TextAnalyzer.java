package filehandling_tasks;
//task 9


import java.io.*;
import java.util.Scanner;

public class TextAnalyzer {
    public static void main(String[] args) {
        File file = new File("sample.txt");

        // 🔧 If file doesn't exist, create it and write something inside
        if (!file.exists()) {
            try (PrintWriter writer = new PrintWriter(file)) {
                writer.println("This is a sample line to analyze.");
                System.out.println("sample.txt not found, so a new one was created with sample content.");
            } catch (IOException e) {
                System.out.println("Failed to create file: " + e.getMessage());
                return;
            }
        }

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineCount++;

                String[] words = line.trim().split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount++;
                        charCount += word.length();
                    }
                }
            }

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters (excluding spaces): " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("File still not found: " + e.getMessage());
        }
    }
}

