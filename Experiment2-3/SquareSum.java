import java.util.Scanner;

public class SquareSum
{
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        int sum = 0;
        System.out.println("Enter array elements");
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            arr[i] = arr[i] * arr[i];
            sum += arr[i];

        }
        System.out.println("Sum of elements: " + sum);

    }
}