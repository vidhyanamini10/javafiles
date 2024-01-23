package objectArray;

import java.util.Objects;

public class Person {
    private double height;
    private double weight;
    private String ssn;
    private String phoneNumber;

    // Constructor
    public Person(double height, double weight, String ssn, String phoneNumber) {
        this.height = height;
        this.weight = weight;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
    }

    // Getter methods

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getSsn() {
        return ssn;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Override equals method to match persons based on ssn
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return Objects.equals(ssn, person.ssn);
    }

    // hashCode method should also be overridden when equals is overridden
    @Override
    public int hashCode() {
        return Objects.hash(ssn);
    }

    // toString method to print person details
    @Override
    public String toString() {
        return "Person [height=" + height + ", weight=" + weight +
                ", ssn=" + ssn + ", phoneNumber=" + phoneNumber + "]";
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating some persons for testing
        Person person1 = new Person(170.0, 65.0, "123-45-6789", "123-456-7890");
        Person person2 = new Person(160.0, 55.0, "987-65-4321", "987-654-3210");
        Person person3 = new Person(175.0, 75.0, "123-45-6789", "555-123-4567");

        // Testing equals method
        System.out.println("Testing equals method:");
        System.out.println("person1.equals(person2): " + person1.equals(person2));
        System.out.println("person1.equals(person3): " + person1.equals(person3));
    }
}
