class Worker
{
    String name;
    int salaryRate;   // salary per hour
    int salary;
    Worker(String name, int salaryRate)
    {
        this.name = name;
        this.salaryRate = salaryRate;
    }
    public int comPay(int hours, int salaryRate)
    {
        return hours*salaryRate;
    }
}

class DailyWorker extends Worker
{
    DailyWorker(String name, int salaryRate)
    {
        super(name,salaryRate);
    }
    public int comPay(int days,int salaryRate)
    {
        return days*8*salaryRate; // a daily worker works 8 hours a day
    }

}

class SalariedWorker extends Worker
{
    SalariedWorker(String name, int salaryRate)
    {
        super(name,salaryRate);
    }
    public int comPay(int salaryRate)
    {
        return 40*salaryRate;  // SalariedWorker gets salary for 40 hours
    }
}

public class Firm 
{
    public static void main(String args[])
    {
         DailyWorker john = new DailyWorker("John",50);
        john.salary = john.comPay(6,john.salaryRate);
        System.out.println("My name is " + john.name + " and my salary is $" + john.salary);

        SalariedWorker johnny = new SalariedWorker("Johnny",55);
        johnny.salary = johnny.comPay(johnny.salaryRate);
        System.out.println("My name is " + johnny.name + " and my salary is $" + johnny.salary);
    }
}