package map;

import org.junit.Test;
import static org.junit.Assert.*;

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

    // Method to get a student by name from the HashMap
    public static Student1 getStudentByName(HashMap<String, Student1> studentMap, String name) {
        return studentMap.get(name);
    }
}

public class StudentHashMapExampleTest {
    public static Student1 getStudentByName(HashMap<String, Student1> studentMap, String name) {
        return studentMap.get(name);
    }
    @Test
    public void testGetStudentByName() {
        // Creating a HashMap to store students with first name as key
        HashMap<String, Student1> studentMap = new HashMap<>();

        // Adding 3 students to the HashMap
        studentMap.put("John", new Student1("John", "Doe", 3.8));
        studentMap.put("Jane", new Student1("Jane", "Smith", 3.9));
        studentMap.put("Bob", new Student1("Bob", "Johnson", 3.5));

        // Test case 1: Valid student name
        String validStudentName = "Jane";
        Student1 foundStudent = StudentHashMapExample.getStudentByName(studentMap, validStudentName);
        assertNotNull(foundStudent);
        assertEquals("Jane", foundStudent.getFirstName());
        assertEquals("Smith", foundStudent.getLastName());
        assertEquals(3.9, foundStudent.getGPA(), 0.001);

        // Test case 2: Invalid student name
        String invalidStudentName = "Alice";
        Student1 notFoundStudent = StudentHashMapExample.getStudentByName(studentMap, invalidStudentName);
        assertNull(notFoundStudent);
    }
}
