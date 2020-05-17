import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		System.out.println("Enter the number till which U want to get Numbers");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Odd t1 = new Odd(n);
		t1.start();
		Even t2 =new Even(n);
		t2.start();
	}

}

class Odd extends Thread {
	int n;
	public Odd(int n)
	{
		this.n=n;
	}
	public void run() {
        System.out.println("Odd numbers:");
		for (int i = 1; i <= n; i = i + 2) {
			System.out.println(i);
		}
	}
}

class Even extends Thread {
	int n;
	public Even(int n)
	{
		this.n=n;
	}
	public void run() {
        System.out.println("Even numbers:");
		for (int i = 0; i <= n; i = i + 2) {
			System.out.println(i);
		}
	}
}