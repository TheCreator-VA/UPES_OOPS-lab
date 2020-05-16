import java.util.Scanner;

/*Consider trunk calls of a telephone exchange.
A trunk call can be ordinary, urgent or lightening.
The charges depend on the duration and the type of calls.
Write a program using polymorphism to calculate charges.*/
public class TrunkCall
{
	int type;
	int durationInsecs;
	public static void charges(int duration) 
    {
		int charge = (duration*7)/30;
		System.out.println("Rs"+charge);
	}
	
	
	public static void main(String args[])
	{
		TrunkCall tc = new TrunkCall();
		System.out.println("Enter Type of Call:\n0: Ordinary\n1: Urgent\n2: Lightening");
		Scanner s = new Scanner(System.in);
		tc.type = s.nextInt();
		System.out.println("Enter Duration in secs");
		tc.durationInsecs = s.nextInt();
		if(tc.type==0)
			Ordinary.charges(tc.durationInsecs);
		else if(tc.type==1)
			Urgent.charges(tc.durationInsecs);
		else if(tc.type==2)
			Lightening.charges(tc.durationInsecs);
		
	}
}





class Ordinary 
{
	public static void charges(int duration) 
    {
		int charge = (duration*7)/60;
		System.out.println("Rs"+charge);
	}

}


class Urgent 
{
	public static void charges(int duration)
    {
		int charge = (duration*5)/60;
		System.out.println("Rs"+charge);

	}

}


class Lightening 
{
	public static void charges(int duration) 
    {
		int charge = (duration*3)/60;
		System.out.println("Rs"+charge);

	}

}
