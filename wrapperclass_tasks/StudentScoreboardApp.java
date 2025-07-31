package wrapperclass_tasks;
//mini project 
import java.util.*;

public class StudentScoreboardApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Map<String, List<Integer>> scoreboard = new HashMap<>();

        scoreboard.put("Nikhil", new ArrayList<>(Arrays.asList(85, 90, 78, 66, 73 )));
        scoreboard.put("Anil", new ArrayList<>(Arrays.asList(92, 88, 95, 69, 77 )));
        scoreboard.put("Rohith", new ArrayList<>(Arrays.asList(70, 75, 80, 90, 85 )));
        scoreboard.put("Akki", new ArrayList<>(Arrays.asList(70, 75, 80, 92, 96 )));
        scoreboard.put("Tony", new ArrayList<>(Arrays.asList(70, 75, 80, 94, 66)));

        String topStudent = null;
        double highestAverage = 0.0;
        for (Map.Entry<String, List<Integer>> entry : scoreboard.entrySet())
        {
            String name = entry.getKey();
            List<Integer> marks = entry.getValue();
            int total = 0;
            for (Integer mark : marks) 
            {
                total += mark; 
            }
            double average = (double) total / marks.size();
            System.out.println(name + " → Scores: " + marks + ", Average: " + average);
            if (average > highestAverage)
            {
                highestAverage = average;
                topStudent = name;
            }
        }
        System.out.println("\n🏅 Highest Scorer: " + topStudent + " with an average of " + highestAverage);
	}
}
