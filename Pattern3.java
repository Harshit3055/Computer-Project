// WAP to print the Pattern
/*
 5
 4  5
 3  4  5
 2  3  4  5
 1  2  3  4  5
*/
public class Pattern3
{
    public static void main(String agrs[])
    {
        int i, j;
        for (i = 5; i >= 1; i--)
        {
            for (j = i; j <= 5; j++)
                System.out.print(j + "  ");
        }
        System.out.println();
    }
}
// © Harshit