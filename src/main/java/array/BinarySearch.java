package array;

public class BinarySearch {




        public static void main(String[] args) {
            int[] array = {11, 22, 25, 64, 100};

            System.out.println("Original Sorted Array:");
            printArray(array);

            int target = 25;

            // Perform binary search
            int index = binarySearch(array, target);

            if (index != -1) {
                System.out.println("Element " + target + " found at index " + index);
            } else {
                System.out.println("Element " + target + " not found in the array");
            }
        }

        // Function to perform Binary Search on a sorted array
        private static int binarySearch(int[] arr, int target) {
            int low = 0;
            int high = arr.length - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] == target) {
                    return mid; // Element found
                } else if (arr[mid] < target) {
                    low = mid + 1; // Search in the right half
                } else {
                    high = mid - 1; // Search in the left half
                }
            }

            return -1; // Element not found
        }

        // Function to print the elements of the array
        private static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


