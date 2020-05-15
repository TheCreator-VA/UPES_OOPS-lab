import java.util.Scanner;

public class ThreeDigitPermutation
{
    public static void main(String args[])
    {
        int i,j,k;
        int arr[] = new int[3];
        Scanner sc = new Scanner(System.in);

        System.out,println("Enter 3 digits:")
        for(i=0;i<3;i++)
        {
            arr[i] = sc.nextInt();
        }


        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                for(k=0;k<3;k++)
                {
                    if( k!= i && k != j && i != j)
                        System.out.println(arr[i] + "" + arr[j] + arr[k]);
                }
            }
        }
    }
}