package Model;
//task 9

public class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }

   
    public String toString() {
        return "Student{id='" + id + "', name='" + name + "'}";
    }
}