package filehandling_tasks;

//task 5

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeStudent {
    public static void main(String[] args) {
    	
        Student s1 = new Student("Rahul", 101, 85);

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"));
            out.writeObject(s1);
            out.close();
            System.out.println("Object serialized and written to student.ser");
            }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
