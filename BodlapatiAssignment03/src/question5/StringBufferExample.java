package question5;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 20; i++) {
                    buffer.append("a");
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 20; i++) {
                    buffer.append("b");
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(buffer.toString()); // will output a sequence of "a" and "b" characters
    }
}
