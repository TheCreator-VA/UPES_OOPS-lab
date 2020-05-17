
import java.util.Scanner;

interface Test
{
    public int square(int numbr);
}

class Arithmetic implements Test
{
    public int square(int number)
    {
        return number*number;
    }
}

public class ToTestInt
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Arithmetic obj = new Arithmetic();
        System.out.print("Enter a number: ");
        System.out.println("Square of number: " + obj.square(sc.nextInt()));
    }
}