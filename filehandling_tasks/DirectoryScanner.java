package filehandling_tasks;

//task 15

import java.io.File;

public class DirectoryScanner {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        
        String directoryPath = "C:\\\\Users\\\\user\\\\eclipse-workspace";

        File dir = new File(directoryPath);

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Invalid directory path: " + directoryPath);
            return;
        }

        File[] items = dir.listFiles();
        if (items == null || items.length == 0) {
            System.out.println("Directory is empty.");
            return;
        }

        System.out.println("Scanning directory: " + directoryPath);
        for (File item : items) {
            String type = item.isDirectory() ? "Directory" : "File";
            long size = item.length(); // Size in bytes

            System.out.printf("%-20s %-10s %10d bytes%n", item.getName(), type, size);
        }
    }
}
