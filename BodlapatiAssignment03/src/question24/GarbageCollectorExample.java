package question24;

public class GarbageCollectorExample {
	   public static void main(String[] args) {
	      GarbageCollectorExample obj = new GarbageCollectorExample();
	      obj = null;
	      System.gc();
	   }
	   
	   @Override
	   protected void finalize() throws Throwable {
	      System.out.println("Garbage collector called");
	      super.finalize();
	   }
	}
