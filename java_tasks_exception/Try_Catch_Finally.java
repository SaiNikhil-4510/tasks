package java_tasks_exception;

//task 5.2
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Try_Catch_Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = null;
		        try
		        {
		            File file = new File("input.txt");
		            sc = new Scanner(file);
		            while (sc.hasNextLine()) 
		            {
		                System.out.println(sc.nextLine());
		            }
		        }
		        catch (FileNotFoundException ex) {
		            System.out.println("File not found!");
		        } 
		        finally 
		        {
		            if (sc != null) 
		            {
		                sc.close();
		                System.out.println("Scanner closed.");
		            }
		        }
		    }
		}


        
