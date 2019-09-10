package eu.dorsum.training.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	public static void main(String[] args) {
		
		//Put one element into a HashSet
		Set<String> set = new TreeSet<>();
		set.add("ccc");
		set.add("bbc");
		set.add("abc");		
		System.out.println("Elements: " + String.join(",", set));
		System.out.println("Does set contains abc? " + set.contains("abc") );
		
		//Iterating using Iterator
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
		  String el = (String) iterator.next();
		}
		
		//Iterating through for-each loop
		for(Object object : set) {
			String el = (String) object;
		}
		
		//Java 8
//		System.out.println("Elements: ");
		set.stream().forEach((e1) -> { System.out.println(e1); });

		//Java 8 - get first item
		String firstItem = set.stream().findFirst().get();
		System.out.println("First item: " + firstItem);
		
		//size, isEmpty, addAll, removeAll
		System.out.println("Size of set: " + set.size());
		System.out.println("is the set empty? " + set.isEmpty());
		
		Set<String> treeSet = new TreeSet<>();
		treeSet.addAll(set);
		System.out.println("Elements in the new treeSet after addALl: " + String.join(",", set));

		set.removeAll(treeSet);
		System.out.println("Elements after removeAll: " + String.join(",", set));
		
		System.out.println("---------------------");
		System.out.println("Elements of number set: ");
		TreeSet<Integer> numberSet = new TreeSet<Integer>();
		numberSet.add(23);      		 
		numberSet.add(11);    		 
		numberSet.add(41);     
		numberSet.add(7); 
		numberSet.add(69);		 
		numberSet.add(18);		 
		numberSet.add(38);
		System.out.println("Elements: " + String.join(",", String.valueOf(numberSet)));
	
	}
	
	
}
