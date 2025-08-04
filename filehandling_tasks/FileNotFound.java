package filehandling_tasks;

//task 11

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFound {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        try {
            // Try reading a non-existent file
            BufferedReader reader = new BufferedReader(new FileReader("missingfile.txt"));
            String line;
            while ((line = reader.readLine()) != null) 
            {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e)
        {
            System.out.println("File not found. Please check the file name.");
        } catch (IOException e) 
        {
            System.out.println("An error occurred while reading the file.");
        }
    }
}
