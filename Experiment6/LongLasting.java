
public class LongLasting {
	public static void main(String args[]) {
		FiveThreads t1 = new FiveThreads();
		t1.setPriority(1);
		t1.start();
		FiveThreads t2 = new FiveThreads();
		t2.setPriority(2);
		t2.start();
		FiveThreads t3 = new FiveThreads();
		t3.setPriority(3);
		t3.start();
		FiveThreads t4 = new FiveThreads();
		t4.setPriority(4);
		t4.start();
		FiveThreads t5 = new FiveThreads();
		t5.setPriority(5);
		t5.start();
		if(t1.isAlive())
			System.out.println("t1 is long lasting "+"priority of t1: "+t1.getPriority());
		if(t2.isAlive())
			System.out.println("t2 is long lasting "+"priority of t2: "+t2.getPriority());
		if(t3.isAlive())
			System.out.println("t3 is long lasting "+"priority of t3: "+t3.getPriority());
		if(t4.isAlive())
			System.out.println("t4 is long lasting "+"priority of t4: "+t4.getPriority());
		if(t5.isAlive())
			System.out.println("t5 is long lasting "+"priority of t5: "+t5.getPriority());

	}

}

class FiveThreads extends Thread {
	public void run() {
		int p = this.getPriority();
		if (p > 3) {
			try {
				this.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}