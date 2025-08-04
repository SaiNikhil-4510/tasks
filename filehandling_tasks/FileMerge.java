package filehandling_tasks;

//task 14
import java.io.*;

public class FileMerge {

    public static void main(String[] args) {
        String[] sourceFiles = {"file1.txt", "file2.txt"};
        String mergedFile = "merged.txt";

        // Create missing files with sample content
        createIfMissing("file1.txt", "This is file 1");
        createIfMissing("file2.txt", "This is file 2");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFile))) {
            for (String fileName : sourceFiles) {
                try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.write(line);
                        writer.newLine();
                    }
                } catch (IOException e) {
                    System.out.println("Could not read " + fileName + ": " + e.getMessage());
                }
            }

            System.out.println("Files merged successfully into " + mergedFile);

        } catch (IOException e) {
            System.out.println("Error writing merged file: " + e.getMessage());
        }
    }

    // 🛠️ Moved outside of main()
    public static void createIfMissing(String fileName, String content) {
        File file = new File(fileName);
        if (!file.exists()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(content);
                System.out.println(fileName + " was created with sample content.");
            } catch (IOException e) {
                System.out.println("Error creating " + fileName + ": " + e.getMessage());
            }
        }
    }
}
