package array;

public class Reverse {
    public static void main(String[] args) {
        int rev[] = {10, 5, 7, 18, 90, 3, 5, 6, 8, 2, 4};

        System.out.println("Original Array:");
        printArray(rev);

        // Reverse the array
        reverseArray(rev);

        System.out.println("Array after Reversing:");
        printArray(rev);
    }

    // Function to reverse the array
    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
    }

    // Function to print the elements of the array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

