package array;

//Given an integer array of size N, write a program to rotate the array left by "x" positions.
// Example: input - arr[] = {1, 2, 3, 4, 5, 6, 7}, x = 2 Output: 3 4 5 6 7 1 2
public class RotateArray {
    public static void main(String[] args) {
        int rot [] = {1,2,3,4,5,6,7};

        for (int i = 2; i< rot.length; i++){
            System.out.println(rot[i]);
        }

    }
}
