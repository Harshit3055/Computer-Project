// WAP to check the given number is Duck or Not.
// A number is said to be duck if it has zero in it.
import java.util.Scanner;
public class Duck {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int num, a, c=0;
        System.out.println("Enter a number");
        num = in.nextInt();
        while(num>0)
        {
            a = num%10;
            if(a==0)
            {
                System.out.println("It is a Duck Number");
                c++;
                break;
            }
            num/=10;
        }
        if(c==0)
        {
            System.out.println("It is not a Duck Number");
        }
    }
}
// © Harshit