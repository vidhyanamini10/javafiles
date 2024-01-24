package list;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        // Convert ArrayList to an Array
        String[] stringArray = new String[stringList.size()];
        stringArray = stringList.toArray(stringArray);

        // Print the original ArrayList
        System.out.println("ArrayList: " + stringList);

        // Print the converted array
        System.out.println("Converted Array: ");
        for (String element : stringArray) {
            System.out.println(element);
        }
    }
}

