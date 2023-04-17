package question2;

public class Child extends Parent {
    // Overriding public method in Parent class
    public void method1() {
        System.out.println("This is public method in Child class and parent class.");
    }
    
    // Attempting to change access modifier of private method in Parent class
    
     protected void method2() {
       System.out.println("This is private method in parent class to protected in child.");
    }
    
    // Overriding protected method in Parent class
    public void method3() {
        System.out.println("This is protected method of parent class to public Child class.");
    }
    
    // Overriding default method in Parent class
    void method4() {
        System.out.println("This is default method in Parent class.");
    }
}