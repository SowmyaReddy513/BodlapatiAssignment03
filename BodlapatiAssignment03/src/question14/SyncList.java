package question14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> synchronizedList = new ArrayList<String>();

		synchronized(synchronizedList) {
		    synchronizedList.add("Sowmya");
		}
		
		List<String> synchronizedList1 = Collections.synchronizedList(new ArrayList<String>());

		synchronizedList1.add("element");
		
		List<String> synchronizedList2 = new CopyOnWriteArrayList<String>();

		synchronizedList2.add("Reddy");
		
		System.out.println(synchronizedList);
		System.out.println(synchronizedList1);
		System.out.println("Using CopyOnWriteArrayList" + synchronizedList2);





	}

}
