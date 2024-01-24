package list;
import java.util.ArrayList;
public class RemoveList {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Adidas");
        stringList.add("Nike");
        stringList.add("puma");
        stringList.add("New Balance");

        // Print the ArrayList before removal
        System.out.println("ArrayList before removal: " + stringList);

        // Check if the ArrayList is not empty before removing the last element
        if (!stringList.isEmpty()) {
            // Remove the last object in the ArrayList
            stringList.remove(stringList.size() - 1);

            // Print the ArrayList after removal
            System.out.println("ArrayList after removing the last element: " + stringList);
        } else {
            System.out.println("ArrayList is empty. No elements to remove.");
        }
    }
}
