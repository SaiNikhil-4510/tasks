package filehandling_tasks;

//task 4

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            BufferedReader reader = new BufferedReader(new FileReader("info.txt"));
	            FileWriter writer = new FileWriter("copy.txt");
	            String line;
	            while ((line = reader.readLine()) != null)
	            {
	                writer.write(line + "\n");
	            }
	            reader.close();
	            writer.close();
	            System.out.println("File content successfully copied.");
	        } 
		 catch (IOException e)
		      {
	            System.out.println("An error occurred during file copying.");
	            e.printStackTrace();
	          }
	}

}

        
