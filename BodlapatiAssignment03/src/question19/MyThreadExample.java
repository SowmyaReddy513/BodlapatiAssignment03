package question19;

public class MyThreadExample extends Thread {
    public void run() {
        // Thread logic here
    	
    	System.out.println("From Thread Example");
    }



public static void main(String args[]) {
	MyThreadExample thread = new MyThreadExample();
	thread.start();

}

}


