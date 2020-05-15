import java.util.Scanner;
public class Fibonacci{
    public static void main(String args[])
    {
        int n;
        System.out.println("Enter the number of terms to print.");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a = 0;
        int b = 1;
        int term,i;
        for(i=0;i<n;i++)
        {
            if(i<=1)
            {
                term = i;
            }
            else
            {
                term = a+b;
                a = b;
                b = term;
            }
            System.out.print("  " + term);
        }
    }
}