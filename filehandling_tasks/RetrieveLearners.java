package filehandling_tasks;

//task 10

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class RetrieveLearners {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("learners.ser"))) {
            ArrayList<Learner> learners = (ArrayList<Learner>) in.readObject();

            System.out.println("Deserialized learner records:");
            for (Learner l : learners) {
                l.display();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
