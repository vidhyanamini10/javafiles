package list;
import java.util.ArrayList;

class Student {
    String firstName;
    String lastName;
    double GPA;

    public Student(String firstName, String lastName, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}

public class RemoveStudent {
    public static void main(String[] args) {
        // Create an ArrayList of Students
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", "Doe", 3.5));
        studentList.add(new Student("Jane", "Smith", 4.0));
        studentList.add(new Student("Bob", "Johnson", 3.2));
        studentList.add(new Student("Alice", "Williams", 3.8));

        // Print the ArrayList before removal
        System.out.println("Students before removal: " + studentList);

        // Calculate the average GPA
        double totalGPA = 0;
        for (Student student : studentList) {
            totalGPA += student.GPA;
        }
        double averageGPA = totalGPA / studentList.size();

        // Remove students with GPA less than the average GPA
        studentList.removeIf(student -> student.GPA < averageGPA);

        // Print the ArrayList after removal
        System.out.println("Students after removing below-average GPA: " + studentList);
    }
}
