package question17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastSafeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map = new ConcurrentHashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		Iterator<String> itr = map.keySet().iterator();
		while(itr.hasNext()){
		   System.out.println(itr.next());
		   map.put("three", 3); // modifying map while iteration
		}
		
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		Iterator<Integer> itr1 = list.iterator();
		while(itr1.hasNext()){
		   System.out.println(itr1.next());
		   //exception
		   list.add(3); // modifying list while iteration
		}



	}

}
