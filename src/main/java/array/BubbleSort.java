package array;

public class BubbleSort {

        public static void main(String[] args) {
            int[] array = {64, 25, 12, 22, 11};

            System.out.println("Original Array:");
            printArray(array);

            // Perform bubble sort
            bubbleSort(array);

            System.out.println("Array after Bubble Sort:");
            printArray(array);
        }

        // Function to perform Bubble Sort on an array
        private static void bubbleSort(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j + 1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
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


