package filehandling_tasks;

//task 10

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class StoreLearners {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        ArrayList<Learner> learners = new ArrayList<>();
        learners.add(new Learner(101, "Anil", 88.5));
        learners.add(new Learner(102, "Nikhil", 91.2));
        learners.add(new Learner(103, "Rohith", 76.8));

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("learners.ser"))) {
            out.writeObject(learners);
            System.out.println("Learners have been serialized to learners.ser");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
