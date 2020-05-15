import java.util.Scanner;

public class GreatestOf3
{
    public static void main(String args[])
    {
        int a,b,c,grtst;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if( a>b )
            grtst = a;
        else
            grtst = b;
        if( c>grtst )
            grtst = c;
        System.out.println(grtst + " is greatest among the 3 numbers.");


    }
}