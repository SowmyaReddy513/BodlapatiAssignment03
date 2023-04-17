package question7;

public class Example {
	
	private final int value;

    public Example(int value) {
        this.value = value;
    }

    // this constructor cannot be overridden by a subclass. here only throwig error
    public final Example() {
        this.value = 0;
    }

}
