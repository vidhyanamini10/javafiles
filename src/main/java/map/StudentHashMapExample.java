package map;
import java.util.HashMap;

class Student1 {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student1(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    // Getter methods for attributes
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGPA() {
        return gpa;
    }
}

public class StudentHashMapExample {
    public void main(String[] args) {
        // Creating a HashMap to store students with first name as key
        HashMap<String, Student1> studentMap = new HashMap<>();

        // Adding 8 students to the HashMap
        studentMap.put("John", new Student1("John", "Doe", 3.8));
        studentMap.put("Jane", new Student1("Jane", "Smith", 3.9));
        studentMap.put("Bob", new Student1("Bob", "Johnson", 3.5));
        studentMap.put("Alice", new Student1("Alice", "Williams", 4.0));
        studentMap.put("Charlie", new Student1("Charlie", "Brown", 3.7));
        studentMap.put("Emily", new Student1("Emily", "Davis", 3.6));
        studentMap.put("David", new Student1("David", "Miller", 3.8));
        studentMap.put("Eva", new Student1("Eva", "Clark", 3.9));

        // Example: Getting a student by name
        String studentName = "Alice";
        Student1 foundStudent = getStudentByName(studentMap, studentName);

        if (foundStudent != null) {
            System.out.println("Found student: " + foundStudent.getFirstName() + " " +
                    foundStudent.getLastName() + " GPA: " + foundStudent.getGPA());
        } else {
            System.out.println("Student with name " + studentName + " not found.");
        }
    }

    // Method to get a student by name from the HashMap
    static Student1 getStudentByName(HashMap<String, Student1> studentMap, String name) {
        return studentMap.get(name);
    }
}

