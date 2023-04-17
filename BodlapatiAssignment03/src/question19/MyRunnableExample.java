package question19;

public class MyRunnableExample implements Runnable {
	
	public void run() {
        // Thread logic here
		System.out.println("From Runnable");
    }
	
	
	public static void main(String args[]) {
		Thread thread = new Thread(new MyRunnableExample());
		thread.start();

	}


}
