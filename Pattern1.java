// WAP to print the Pattern
/*
 1  2  3  4  5
 2  2  3  4  5
 3  3  3  4  5
 4  4  4  4  5
 5  5  5  5  5
*/
public class Pattern1 {
    public static void main(String[] args)
    {
        int i, j, k, c=1;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
              System.out.print(c+"  ");
            for(k=j;k<=5;k++)
                System.out.print(k+"  ");
            System.out.println();
            c++;
        }
    }
}