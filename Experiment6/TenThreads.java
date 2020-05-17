class Counter 
{
	int counter = 0;
	public synchronized int increment() 
    {
		counter++;
		return counter;
	}

}




public class TenThreads 
{
	public static void main(String args[]) 
    {
		Counter counter = new Counter();
		Incrementer t1 = new Incrementer(counter);
		t1.start();
		Incrementer t2 = new Incrementer(counter);
		t2.start();
		Incrementer t3 = new Incrementer(counter);
		t3.start();
		Incrementer t4 = new Incrementer(counter);
		t4.start();
		Incrementer t5 = new Incrementer(counter);
		t5.start();
		Incrementer t6 = new Incrementer(counter);
		t6.start();
		Incrementer t7 = new Incrementer(counter);
		t7.start();
		Incrementer t8 = new Incrementer(counter);
		t8.start();
		Incrementer t9 = new Incrementer(counter);
		t9.start();
		Incrementer t10 = new Incrementer(counter);
		t10.start();
	}
}

class Incrementer extends Thread 
{
	Counter counter = null;

	public Incrementer(Counter counter) 
    {
		this.counter = counter;
	}

	public void run() 
    {
		System.out.println(Thread.currentThread().getName() +" counter:"+ counter.increment());
	}

}



