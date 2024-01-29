package set;




import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

    public String removeDuplicate(String input) {
        if (input == null) {
            return null;
        }

        Set<Character> charSet = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (charSet.add(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
