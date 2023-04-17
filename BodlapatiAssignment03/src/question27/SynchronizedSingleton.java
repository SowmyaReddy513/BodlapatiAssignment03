package question27;

import question26.Singleton;

public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {}

    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
    
    public void printMessage() {
        System.out.println("Hello Sowmya!");
     }
    
    
    public static void main(String[] args) {
        // Get the singleton instance
    	SynchronizedSingleton singleton = SynchronizedSingleton.getInstance();
        // Call the method
        singleton.printMessage();
     }

}

