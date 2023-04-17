package question12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FinalExample {
	   final int a = 513;
	   
	   public void finalize() {
		      System.out.println("Object is garbage collected.");
		   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 FinalExample obj = new FinalExample();
	      System.out.println("The value of a is: " + obj.a);
	      
	      
	      BufferedReader br = null;
	      try {
	         br = new BufferedReader(new FileReader("example.txt"));
	         String line;
	         while ((line = br.readLine()) != null) {
	            System.out.println(line);
	         }
	      } catch (IOException e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if (br != null)
	               br.close();
	         } catch (IOException e) {
	            e.printStackTrace();
	         }
	      }
	      
	      
	      FinalExample obj1 = new FinalExample();
	      FinalExample obj2 = new FinalExample();
	      obj1 = null;
	      obj2 = null;
	      System.gc();


	}

}
