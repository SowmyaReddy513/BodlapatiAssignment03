package question5;

public class StringBuilderExample implements Runnable {

	 private StringBuilder sb;

	    public StringBuilderExample(StringBuilder sb) {
	        this.sb = sb;
	    }

	    @Override
	    public void run() {
	        for (int i = 0; i < 20; i++) {
	            sb.append("a");
	        }
	    }

	    public static void main(String[] args) {
	        StringBuilder sb = new StringBuilder();
	        Thread t1 = new Thread(new StringBuilderExample(sb));
	        Thread t2 = new Thread(new StringBuilderExample(sb));
	        t1.start();
	        t2.start();
	        try {
	            t1.join();
	            t2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println(sb.length());
	    }
	}