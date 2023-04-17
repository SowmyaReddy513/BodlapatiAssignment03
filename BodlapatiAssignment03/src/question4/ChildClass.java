package question4;

public class ChildClass extends SuperClass{
	
	@Override
	public static void staticMethod() {
        System.out.println("Child static method");
    }
	
	@Override
	private void privateMethod() {
        System.out.println("Child private method");
    }

}
