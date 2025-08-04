package filehandling_tasks;

//task 1 

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            FileWriter writer = new FileWriter("info.txt");
	            writer.write("Java I/O is powerful!\n");
	            writer.write("Learn Java step-by-step");
	            writer.close();
	            System.out.println("Successfully wrote to the file.");
	        } 
		 catch (IOException e)
		 {
	            System.out.println("An error occurred while writing to the file.");
	            e.printStackTrace();
		 }
	}

}

        

