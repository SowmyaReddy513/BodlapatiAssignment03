package question3;

public class CovariantExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Animal();
	      Dog d = new Dog();
	      
	      // Test covariant return type
	      Animal a2 = d.reproduce();
	      System.out.println(a2.getClass());

	}

}
