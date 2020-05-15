import java.util.Scanner;

public class Grade
{

    public static void bubbleSort(int arr[],String arr2[],int n)
    {
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if( arr[i] < arr[j+1])
                {
                    //swap(arr[i],arr[j])
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    //swap(arr2[i],arr2[j])
                    String temp2 = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp2;           
                }
            }
        }
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of students: ");
        n = sc.nextInt();
        int[] students = new int[n];
        String[] sNames = new String[n];
        int i = 0;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter marks of student " + (i+1));
            students[i] = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name of student " + (i+1));
            sNames[i] = sc.nextLine();
        }
        Grade.bubbleSort(students,sNames,n);
        i = 0;
        while(i<n)
        {
            System.out.print(sNames[i] +": " + students[i] + " ");
            if(students[i] <= 40)
                System.out.println("Fail");
            else if(students[i] > 40 && students[i] <= 50)
                System.out.println("Pass");
            else if(students[i] > 51 && students[i] <= 75)
                System.out.println("Merit");
            else if(students[i] > 75)
                System.out.println("Distinction");
            else 
                System.out.println("Invalid Entry");
            i++;
        }

        
    }
}