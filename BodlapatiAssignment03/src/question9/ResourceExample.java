package question9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		        System.out.println(line);
		    }
		} catch (IOException e) {
		    System.err.println("Failed to read file: " + e.getMessage());
		}


	}

}
