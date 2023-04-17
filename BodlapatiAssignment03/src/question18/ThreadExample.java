package question18;

public class ThreadExample extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        ThreadExample t = new ThreadExample();
        t.start(); // start the thread
        t.start(); // attempt to start the thread again
    }
}
