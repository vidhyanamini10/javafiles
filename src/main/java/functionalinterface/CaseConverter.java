package functionalinterface;

public class CaseConverter {
    public String convertCase(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            }
        }
        return new String(chars);
    }
}
