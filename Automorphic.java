// WAP to accept a number from the user and Check weather it is Automorphic or Not
// A number is Said to be Automorphic if it is Contained it last of its Square
import java.util.Scanner;
public class Automorphic {
    public static void main(String agrs[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        int c=0, sqr = num*num;
        int temp =num;
        while(temp>0){
            c++;
            temp=temp/10;
        }
        int lastSquareDigits = (int) (sqr%(Math.pow(10,c)));
        if(num == lastSquareDigits)
            System.out.println("Automorphic number");
        else
            System.out.println("Not an Automorphic number");
    }
}
// © Harshit