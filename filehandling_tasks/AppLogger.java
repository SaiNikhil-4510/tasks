package filehandling_tasks;

//task 7


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppLogger {
    public static void main(String[] args) {
        String logFile = "app.log";
        String message = "Application started";

        // Define the timestamp format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = LocalDateTime.now().format(formatter);

        // Build the log entry
        String logEntry = "[" + timestamp + "] " + message;

        // Write the log entry to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
            writer.write(logEntry);
            writer.newLine();
            System.out.println("Log entry added to app.log.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the log.");
            e.printStackTrace();
        }
    }
}
