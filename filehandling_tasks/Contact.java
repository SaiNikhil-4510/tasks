package filehandling_tasks;

//task 8

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String toFileFormat() {
        return name + "," + phoneNumber;
    }

    public static Contact fromFileFormat(String line) {
        String[] parts = line.split(",");
        return new Contact(parts[0], parts[1]);
    }

    public void display() {
        System.out.println("Name: " + name + ", Phone: " + phoneNumber);
    }

    public String getName() {
        return name;
    }
}
