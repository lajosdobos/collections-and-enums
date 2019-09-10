package eu.dorsum.training.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListExample {
	
	public static void main(String[] args) {
		
//		Queue<String> queue = new LinkedList<>();
//		queue.offer("1");
//		queue.offer("2");
//		queue.offer("b");
//		while(!queue.isEmpty()) System.out.println(queue.poll());
		
		List<String> list = new LinkedList<>();
//		List<String> listWithCapacity = new ArrayList<>());
		list.add("string1");
		list.add("string2");
		
		//for-each
		for(String s : list) {
//			System.out.println(s);
		}
		
		//java 8
//		list.stream().forEach(i -> System.out.println(i));	
		System.out.println("Elements: " + String.join(",", list));

		//getting first element from a list
		String firstItem = list.get(0);
		System.out.println("Firs item: " + firstItem);
		
		//remove element from a list
		list.remove(1);
		System.out.println("Elements after removing the second element: " + String.join(",", list));
		
		//indexOf
		int indexOfStringOne = list.indexOf("string1");
		System.out.println("Index of string one: " + indexOfStringOne);
		
		//setting an element from a list
		list.set(indexOfStringOne, "string3");
		
		//indexOf
		indexOfStringOne = list.indexOf("string1");
		System.out.println("Index of string one: " + indexOfStringOne);
		
		//lastIndexOf
		int lastIndexOfStringOne = list.lastIndexOf("string1");
		System.out.println("Last index of string one: " + lastIndexOfStringOne);
		lastIndexOfStringOne = list.lastIndexOf("string3");
		System.out.println("Last index of string one: " + lastIndexOfStringOne);

		//sublist
		list.subList(0, 1);
		System.out.println("Elements after sublist(0,1): " + String.join(",", list));
	
		List<String> arrayList = new ArrayList<>();
		arrayList.add("item1");
		arrayList.add("item2");
		arrayList.add("item3");
		arrayList.add("string1");
		arrayList.add("string3");	
		arrayList.retainAll(list);
		System.out.println("Elements after retainAll: " + String.join(",", list));
	
	}
}
