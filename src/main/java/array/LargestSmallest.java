package array;

public class LargestSmallest {

    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,10,12,100,45,67,90};
        int max = num[0];
        int min = num[0];

        for (int i =0; i<num.length; i++){
                if (num[i] > max){
                    max=num[i];
                }
                if (num[i]< min){
                    min = num[i];
                }
        }
        System.out.println("maximum number is : " + max);
        System.out.println("minimum number is : " + min);
    }


}
