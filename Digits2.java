// WAP to Accept a number from the user and print the sum of even digits and product of odd digits of the given number.
import java.util.Scanner;
public class Digits2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num, a, sum = 0,prod = 1;
        System.out.println("Enter a Number");
        num = in.nextInt();
        while(num>0)
        {
            a = num%10;
            if(a%2==0)
            {
                sum = sum+ a;
            }
            else
            {
                prod = prod*a;
            }
            num/=10;
        }
        System.out.println("The Sum of Even Digits are = "+sum);
        System.out.println("The Product of Odd digits are = "+prod);
    }
}
// © Harshit