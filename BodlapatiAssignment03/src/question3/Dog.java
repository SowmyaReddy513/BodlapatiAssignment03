package question3;

public class Dog extends Animal{
	
	@Override
	public Dog reproduce() {
	      System.out.println("Dog reproducing.");
	      return new Dog();
	   }
}
