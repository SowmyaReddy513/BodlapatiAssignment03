package question13;

import java.util.ArrayList;
import java.util.Vector;

public class ListsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vector<String> vector = new Vector<>();
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the Vector and the ArrayList
        vector.add("India");
        arrayList.add("USA");

        vector.add("UK");
        arrayList.add("Banana");

        vector.add("China");
        arrayList.add("Germany");

        // Print the elements in the Vector and the ArrayList
        System.out.println("Vector: " + vector);
        System.out.println("ArrayList: " + arrayList);

        // Remove an element from the Vector and the ArrayList
        vector.remove("USA");
        arrayList.remove("USA");
        
        System.out.println("Vector after removal: " + vector);
        System.out.println("ArrayList after removal: " + arrayList);

	}

}
