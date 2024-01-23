public class Student{ // defining a class in java
    String name; // creating string variable and assigining value


    String getName(){  // creating an method which will returns the name
        return name;

    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name ="srividhya";
        System.out.println(s.getName());
    }

}