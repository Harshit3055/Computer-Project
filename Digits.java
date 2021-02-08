// WAP to accept a number form the user and count the number of digits present in a given number
import java.util.*;
public class Digits {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num,c=0;
        System.out.println("Enter a Number");
        num = in.nextInt();
        while(num>0)
        {
            c++;
            num/=10;
        }
        System.out.println("The Number of Digits are = "+c);
    }

}
// © Harshit