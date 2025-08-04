package java_collections_tasks;

//task 5.5

import java.util.*;

class TopperRecord 
{
    private String id;
    private String name;
    private int score;

    public TopperRecord(String id, String name, int score)
    {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getScore() 
    {
        return score;
    }

    @Override
    public String toString()
    {
        return name + " (" + id + ") → Score: " + score;
    }
}

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<TopperRecord> students = Arrays.asList(
		            new TopperRecord("S101", "Alice", 86),
		            new TopperRecord("S102", "Bob", 92),
		            new TopperRecord("S103", "Charlie", 75),
		            new TopperRecord("S104", "Diana", 95),
		            new TopperRecord("S105", "Ethan", 89)
		        );

		        int topN = 3;
		        PriorityQueue<TopperRecord> maxHeap = new PriorityQueue<>(
		            (a, b) -> Integer.compare(b.getScore(), a.getScore())
		        );
		        maxHeap.addAll(students);
		        System.out.println("Top " + topN + " Highest Scoring Students:");
		        for (int i = 0; i < topN && !maxHeap.isEmpty(); i++) 
		        {
		            System.out.println(maxHeap.poll());
		        }
	}

}
