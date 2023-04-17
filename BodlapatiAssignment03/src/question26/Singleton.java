package question26;

public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
        // private constructor
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        // Get an instance of the singleton object
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("singleton1: " + singleton1);

        // Get another instance of the singleton object
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton2: " + singleton2);

        // Check if both instances are the same
        System.out.println("Are the instances the same? " + (singleton1 == singleton2));
    }
}
