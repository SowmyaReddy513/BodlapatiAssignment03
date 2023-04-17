package question2;

public class Parent {
    public void method1() {
        System.out.println("This is public method in Parent class.");
    }
    
    private void method2() {
        System.out.println("This is private method in Parent class.");
    }
    
    protected void method3() {
        System.out.println("This is protected method in Parent class.");
    }
    
    void method4() {
        System.out.println("This is default method in Parent class.");
    }
}