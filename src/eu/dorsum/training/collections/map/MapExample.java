package eu.dorsum.training.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {
	
	public static void main(String[] args) {
	
		Map<String, Object> map = new HashMap<>();
		map.put("key1", new String("as"));
		map.put("key2" , 12);
		map.put("key2", 123);
		
		//iterator on an entry-set
	    Iterator it = map.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry) it.next();
//	        System.out.println(pair.getKey() + " = " + pair.getValue());
//	        it.remove(); // avoids a ConcurrentModificationException
	    }
	    
	    //for-each on keySet
	    for(String s : map.keySet()) {
//	    	System.out.println("key: " + s);
	    }
	    
	    //for-each on values
	    for (Object value : map.values()) {
//	    	System.out.println("value: " + value);
	    }
	    
	    //for-each on entry-set
	    for (Map.Entry<String, Object> entry : map.entrySet()) {
	        String key = entry.getKey();
	        Object value = entry.getValue();
	    }
	    
	    //java 8
//		map.forEach((k,v)-> System.out.println(k));
	    System.out.println("Elements: " + map);

		//removing element from a map
		map.remove("key1");
	    System.out.println("Elements after remove: " + map);

	    //clear
	    map.clear();
	    System.out.println("Elements after clear: " + map);

	    //contains
		map.put("key1", new String("as"));
		map.put("key2" , 12);
		System.out.println("Does it contai key1? " + map.containsKey("key1"));
	    
	}
}
