package question20;

public class ThreadStatesExample {
    
    public static void main(String[] args) throws InterruptedException {
        
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // Code to be executed by the thread
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        System.out.println("Thread state: " + thread.getState()); // NEW
        
        thread.start();
        System.out.println("Thread state: " + thread.getState()); // RUNNABLE
        
        Thread.sleep(500);
        System.out.println("Thread state: " + thread.getState()); // TIMED_WAITING
        
        Thread.sleep(1000);
        System.out.println("Thread state: " + thread.getState()); // TERMINATED
    }
}
