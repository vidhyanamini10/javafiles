package loopsconditions;

public class Pt {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1, count = 0; i <= n; i++, count = 0) {
            while (count++ < n) {
                System.out.print(count <= n - i ? "+ " : "- ");
            }
            System.out.println();
        }
    }
}

