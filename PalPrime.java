// WAP to any number from user and Check Palprime.
// A Palprime is number if it is said to be Palindrome as Prime
import java.util.*;
public class PalPrime {
    public static void main(String agrs[])
    {
        Scanner in = new Scanner(System.in);
        int c=0, num, num2, i, a, new_num=0;
        System.out.println("Enter a Number");
        num = in.nextInt();
        num2 = num;
        for(i=1;i<=num;i++)
        {
            if(num%i == 0)
                c++;
        }
        if(c==2)
        {
            while(num>0)
            {
              a = num%10;
              new_num = (new_num*10)+a;
              num/=10;
            }
            if(new_num==num2)
                System.out.println("Its A Palprime");
            else
                System.out.println("Its not a Palprime");
        }
        else
            System.out.println("Its not a Palprime");
    }
}
// © Harshit