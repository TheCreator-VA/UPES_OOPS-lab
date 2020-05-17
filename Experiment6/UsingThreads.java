
public class UsingThreads {

	public static void main(String[] args) {
		System.out.println("In main thread");
		Task t1 = new Task();
		t1.start();

	}

}
 class Task extends Thread{
	 public void run()
	 {
		 System.out.println("Inside another thread");
	 }
 }	