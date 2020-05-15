import java.util.Scanner;

public class CommandLineCalc
{
    public static int add(int a, int b)
    {
        return a + b;
    }
    public static int multiply(int a, int b)
    {
        return a * b;
    }
    public static int difference(int a, int b)
    {
        return Math.abs(a - b);
    }
    public static int divide(int a, int b)
    {
        return a / b;
    }
    public static void main(String args[])
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Select an option:\n1: Add\n2: Calculate difference\n3: Multiply\n4: Divide");
        switch(sc.nextInt())
        {
            case 1:
            result = add(a,b);
            break;
            case 2:
            result = difference(a,b);
            break;
            case 3:
            result = multiply(a,b);
            break;
            case 4:
            result = divide(a,b);
            break;
            default:
            System.out.println("You didn't choose any option");
        }
        System.out.println("Result: " + result);
    }
}