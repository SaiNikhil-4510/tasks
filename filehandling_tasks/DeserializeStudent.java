package filehandling_tasks;

//task 5

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeStudent {
    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"));
            Student s1 = (Student) in.readObject();
            in.close();

            System.out.println("Deserialized Student:");
            s1.displayInfo();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
