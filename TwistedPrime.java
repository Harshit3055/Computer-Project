// WAP to accept any number and check the given number is TwistedPrime
// A prime number when reversed is also prime than it is called TwistedPrime
import java.util.*;
public class TwistedPrime {
    public static void main(String agrs[])
    {
        Scanner in = new Scanner(System.in);
        int c=0, num, num2, i, a, new_num=0,c2=0;
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
            for(i=1;i<=new_num;i++)
            {
                if(new_num%i == 0)
                    c2++;
            }
            if(c2==2)
                System.out.println("Its a Twisted Prime");
            else
                System.out.println("Its not a Twisted Prime");
        }
        else
            System.out.println("Its not a Twisted Prime");

    }
}
// © Harshit