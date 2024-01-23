package loopsconditions;
import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number:");

        int n = sc.nextInt();
        int r=0;
        int temp=n;
        int rev=0;
        while(temp>0)
        {
            r=temp%10;
            rev=rev*10+r;
            temp=temp/10;

        }
        System.out.println("The Output");
        System.out.println(rev);


    }




}
