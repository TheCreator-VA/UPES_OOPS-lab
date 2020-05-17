import java.util.Scanner;
interface ConstVariables
{
    float pi = 3.14f;  // Interface variables are by deafault public static final
}

public class AreaOfCircle implements ConstVariables
{
    float area(float r)
    {
        return pi*r*r;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        AreaOfCircle circle = new AreaOfCircle();
        System.out.print("Enter radius of circle: ");
        System.out.println("Area of circle is: " + circle.area(sc.nextFloat()));
    }
}