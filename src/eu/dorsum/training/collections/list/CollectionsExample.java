package eu.dorsum.training.collections.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		list.add("element1");
		list.add("item2");
		list.add("element2");
		list.add("item3");
		list.add("element3");
		list.add("item1");
		
		System.out.println("List before sorting: " + String.join(",", list));
        
		//sort
		Collections.sort(list);
		System.out.println("List after sorting: " + String.join(",", list));

		//reverse
		Collections.reverse(list);
		System.out.println("List after reverse: " + String.join(",", list));		
		
		//shuffle
		Collections.shuffle(list);
		System.out.println("List after shuffle: " + String.join(",", list));

		//swap
		Collections.swap(list, 0, 4);
		System.out.println("List after swap: " + String.join(",", list));

		//rotate
		Collections.rotate(list, 2);
		System.out.println("List after rotate: " + String.join(",", list));
		
		//replace all
		Collections.replaceAll(list, "element1", "new-element-1");
		System.out.println("List after replace all: " + String.join(",", list));
		
		//fill all
		Collections.fill(list, "new-element");
		System.out.println("List after fill: " + String.join(",", list));
		
	}
	
}
