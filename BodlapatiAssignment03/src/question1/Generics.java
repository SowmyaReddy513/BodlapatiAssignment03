package question1;

public class Generics<T> {
	    private T value;

	    public Generics(T value) {
	        this.value = value;
	    }

	    public T getValue() {
	        return value;
	    }

	    public void setValue(T value) {
	        this.value = value;
	    }

	    public static void main(String[] args) {
	        Generics<String> stringGenerics = new Generics<>("Sowmya Reddy");
	        System.out.println("String value: " + stringGenerics.getValue());

	        Generics<Integer> integerGenerics = new Generics<>(513);
	        System.out.println("Integer value: " + integerGenerics.getValue());
	    }

}
