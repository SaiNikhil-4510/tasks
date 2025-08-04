package java_collections_tasks;

//task 5.4

import java.util.*;
import java.util.stream.Collectors;

class StudentProfile {
    private String id;
    private String name;

    public StudentProfile(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return name + " (" + id + ")";
    }
}

public class ListToMap {

    public static void main(String[] args) {
        List<StudentProfile> students = Arrays.asList(
            new StudentProfile("S101", "Alice"),
            new StudentProfile("S102", "Bob"),
            new StudentProfile("S103", "Charlie")
        );

        Map<String, StudentProfile> studentMap = students.stream()
        	    .collect(Collectors.toMap(
        	        StudentProfile::getId,
        	        student -> student,
        	        (existing, replacement) -> existing,
        	        LinkedHashMap::new
        	    ));


        studentMap.forEach((id, student) ->
            System.out.printf("ID: %s → %s%n", id, student)
        );
    }
}
        