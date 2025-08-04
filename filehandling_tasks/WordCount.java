package filehandling_tasks;

//task 3

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wordCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("info.txt"));
            String line;
            while ((line = reader.readLine()) != null)
            {
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty())
                {
                    wordCount += words.length;
                }
            }
            reader.close();
            System.out.println("Total words: " + wordCount);
        } catch (IOException e)
        {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
	}

}

       