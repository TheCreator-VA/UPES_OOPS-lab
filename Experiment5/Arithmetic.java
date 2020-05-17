import java.util.Scanner;

interface DivisionAndMod
{
    public int division(int numerator,int denominator);
    public int modulus(int numerator,int denominator);
}

public class Arithmetic implements DivisionAndMod
{
    public int division(int numerator,int denominator)
    {
        return numerator/denominator;
    }
    public int modulus(int numerator,int denominator)
    {
        return numerator % denominator;
    }
    public static void main(String args[])
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        Arithmetic obj = new Arithmetic();
        System.out.print("Enter numerator: ");
        a = sc.nextInt();
        System.out.print("Enter denominator: ");
        b = sc.nextInt();
        System.out.println("Result of division: " + obj.division(a,b));
        System.out.println("Result of modulus: " + obj.modulus(a,b));

    }
}
