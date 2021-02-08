// WAP to print the Pattern
/*
 1  2  3  4  5
 2  3  4  5  1
 3  4  5  1  2
 4  5  1  2  3
 5  1  2  3  4
*/
public class Pattern2 {
    public static void main(String agrs[])
    {
        int i, j, k;
        for(i=1;i<=5;i++)
        {
            for(j=i;j<=5;j++)
                System.out.print(j + "  ");
            for(k=1;k<i;k++)
                System.out.print(k + "  ");
            System.out.println();

        }
    }
}
