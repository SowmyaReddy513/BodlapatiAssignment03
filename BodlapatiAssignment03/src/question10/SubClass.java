package question10;

import java.io.FileNotFoundException;

public class SubClass extends SuperClass {
	
	
	
	@Override
    void myMethod() throws FileNotFoundException {
        System.out.println("FileNotFound Exception overriden method & exception from super class");
    }
	
}
