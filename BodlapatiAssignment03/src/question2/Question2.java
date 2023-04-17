package question2;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
        Child c = new Child();
        
        // Calls public method in Parent class
        p.method1();
        
        // Calls public method in Child class
        c.method1();
        
        // Calls protected method in Parent class
        p.method3();
        
        // Calls protected method in Child class
        c.method3();
        
        // Calls default method in Parent class
        p.method4();
        
        // Calls default method in Child class
        c.method4();
        
        // Cannot access private method in Parent class from Child class
         c.method2();

        
	}

}
