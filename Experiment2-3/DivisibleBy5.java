public class DivisibleBy5
{
    public static void main(String args[])
    {
        int i=45;
        int sum = 0;
        while(i<250)
        {
            sum += i;
            i += 5  ;
        }
        System.out.println("sum of all integers greater than 40 and less than 250 that are divisible by 5: " + sum);
    }
}