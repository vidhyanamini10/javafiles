package loopsconditions;

import java.util.*;

public class PersonAge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Age");

        int age = sc.nextInt();

        if (age >= 13 && age <= 19) {
            System.out.println("The person is Teen");
        } else if (age < 13) {
            System.out.println("the person is Kid");
        } else {
            System.out.println("The person is Adult");
        }

    }
}

