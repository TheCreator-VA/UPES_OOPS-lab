import java.util.Scanner;

public class CorrespondingMonths
{
    public static void main(String args[])
    {
        String months[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.print("Enter month number(1 - 12): ");
        Scanner sc = new Scanner(System.in);
        int m_no = sc.nextInt();
        if( m_no > 0 && m_no < 13)
            System.out.println(months[m_no-1]);
        else
            System.out.println("Invalid Month");


    }
}