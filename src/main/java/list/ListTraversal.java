package list;
import java.util.ArrayList;
public class ListTraversal {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Adidas");
        stringList.add("Nike");
        stringList.add("puma");
        stringList.add("New Balance");

        // Traverse using a regular for loop
        System.out.println("Traversing using a regular for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            System.out.println(element);
        }

        // Traverse using an enhanced for loop (foreach loop)
        System.out.println("\nTraversing using an enhanced for loop:");
        for (String element : stringList) {
            System.out.println(element);
        }
    }
}
