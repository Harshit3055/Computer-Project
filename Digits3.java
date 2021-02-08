// WAP to accept any number form user and print the sum of even placed digits and product of odd placed digits.
import java.util.Scanner;
public class Digits3 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num, a, sum = 0,prod = 1, c = 1;
        System.out.println("Enter a Number");
        num = in.nextInt();
        while(num>0)
        {
            a = num%10;
            if(c%2==0)
            {
                sum = sum+ a;
            }
            else
            {
                prod = prod*a;
            }
            num/=10;
            c++;
        }
        System.out.println("The Sum of Even Placed Digits are = "+sum);
        System.out.println("The Product of Odd Placed digits are = "+prod);
    }
}
// © Harshit