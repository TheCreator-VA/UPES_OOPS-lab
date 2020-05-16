import java.util.Scanner;


public class Employee 
{
	String name;
	int empid;
	int salary;
	//Default constructor
	Employee(){}
	//parameterized constructor
	Employee(String n,int id,int sal)
	{
		name=n;
		empid=id;
		salary=sal;
	}
	//RETURN NAME AND SALARY
	String returnName()
	{
		return this.name;
	}
	int returnSal()
	{
		return this.salary;
	}
	
	
	public static void main(String args[])
	{	
		Scanner s = new Scanner(System.in);
		System.out.println("enter emloyee's name, id and salary:");
		Employee emp1 = new Employee(s.nextLine(),s.nextInt(),s.nextInt());
		System.out.println("enter manager's name, id and salary: ");
        s.nextLine();
		Manager mgr1 = new Manager(s.nextLine(),s.nextInt(),s.nextInt());
		System.out.println("Enter manager's department");
        s.nextLine();
		mgr1.dept = s.nextLine();
		System.out.println("Enter %increase");
		int inc = s.nextInt();
		emp1.salary = mgr1.increaseSal(emp1.salary, inc);
		System.out.println("EmpId: "+emp1.empid+"\nEmployee's Name: "+emp1.returnName()+"\nEmployee's newIncome: Rs"+emp1.returnSal());
		System.out.println("Manager's Department: "+mgr1.dept+"\nManager's Name: "+mgr1.returnName()+"\nManager's Salary:  Rs"+mgr1.returnSal());

	}
		
}

class Manager extends Employee 
{
	Manager(String n,int id,int sal)
	{
		super(n,id,sal);
	}
	String dept;
	int increaseSal(int sal, int inc)
	{
		sal = sal + sal*inc/100;
		return sal;
	}

}
