package question8;

public class TryWithoutCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            System.out.println("From Try Block");
		}
		finally {
			System.out.println("replaced catch with finall block)");
		}
		
		
        // No catch block
        System.out.println("The program continues after the try block without catching the exception.");

	}

}
