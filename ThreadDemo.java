import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class ThreadUtil extends Thread{
	ThreadUtil(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.currentThread().sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}

public class ThreadDemo{
	public static void main(String args[]){
		Thread t1 = new ThreadUtil("Thread 1");
		Thread t2 = new ThreadUtil("Thread 2");
		Thread t3 = new ThreadUtil("Thread 3");
		t1.setPriority(10);
		t2.setPriority(5);
		t3.setPriority(1);
		t1.start();
		t2.start();
		t3.start();
		try {
			//t1.sleep(1500);
			t2.sleep(1500);
			//t3.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}