package list;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveStudentTest{

    public RemoveStudent removeStudent;

    @Before
    public void setUp(){
        removeStudent = new RemoveStudent();
    }

    @Test
    public void testRemoveLessGPA() {
        // Create an ArrayList of Students
        RemoveStudent.studentList.add(new Student("John", "Doe", 3.5));
        RemoveStudent.studentList.add(new Student("Jane", "Smith", 4.0));
        RemoveStudent.studentList.add(new Student("Bob", "Johnson", 3.2));
        RemoveStudent.studentList.add(new Student("Alice", "Williams", 3.8));

        ArrayList<Student> output = new ArrayList<>();
        output.add(new Student("Jane", "Smith", 4.0));
        output.add(new Student("Alice", "Williams", 3.8));

        assertTrue(removeStudent.RemoveLessGPA(RemoveStudent.studentList).equals(output));
    }
}