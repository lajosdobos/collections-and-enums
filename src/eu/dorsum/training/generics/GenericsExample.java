package eu.dorsum.training.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsExample<T> {
		
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("abc");
		list.add(new Integer(5)); //OK
////
//		for(Object obj : list){
//			//type casting leading to ClassCastException at runtime
//		    String str=(String) obj; 
//		}
		
		List<String> list1 = new ArrayList<String>(); // java 7 ? List<String> list1 = new ArrayList<>(); 
		list1.add("abc");
//		list1.add(new Integer(5)); //compiler error

		for(String str : list1){
		     //no type casting needed, avoids ClassCastException
		}

		DemoClass<String> demoClass = new DemoClass<>();
		DemoClass<Integer> demoClass2 = new DemoClass<>();
		SimpleDemoClass simpleDemo = new SimpleDemoClass();
		SimpleDemoClass simpleDemo2 = new SimpleDemoClass();
		
//		simpleDemo.set("asd");
//		int xx = (Integer) simpleDemo.get();
//		System.out.println(xx);
		
		int x = 100;
		Integer[] array = {100, 100, 1000, 1000};
		int result = demoClass2.countAllOccurrences(array, x);
		
//		List<? extends Number> numberList = new ArrayList<Integer>();
//		numberList.add(null);		
		
		//A generic type where all type arguments are the unbounded wildcard "?” without any restriction on type variables. e.g.
		List<? super Number>  listInt = new ArrayList<Number>(); 
//		List<?>  list2 = new ArrayList<String>(); 
//		List<?>  list3 = new ArrayList<Employee>(); 
		listInt.add(10);
		listInt.add(10.0d);
		
		//Upper bounded wildcards
		//List of Integers
		List<Integer> ints = Arrays.asList(1,2,3,4,5);
		System.out.println(sum(ints));
		  
		//List of Doubles
		List<Double> doubles = Arrays.asList(1.5d,2d,3d);
		System.out.println(sum(doubles));
		 
		List<String> strings = Arrays.asList("1","2");
		//This will give compilation error as :: The method sum(List<? extends Number>) in the
		//type GenericsExample<T> is not applicable for the arguments (List<String>)
//		System.out.println(sum(strings));
		
		
		//Lower bounded wildcards
		//List of grand children
		List<GrandChildClass> grandChildren = new ArrayList<>();
		grandChildren.add(new GrandChildClass());
		addGrandChildren(grandChildren);

		//List of grand childs
		List<ChildClass> childs = new ArrayList<>();
		childs.add(new GrandChildClass());
		addGrandChildren(childs);

		//List of grand supers
		List<SuperClass> supers = new ArrayList<>();
		supers.add(new GrandChildClass());
		addGrandChildren(supers);
		
	}
	
	//Method will accept - extends
	private static Number sum(List<? extends Number> numbers) {
		double s = 0.0;
	    
		for (Number n : numbers) {
	    	s += n.doubleValue();
	    }
	    
	    return s;
	}

	public static void addGrandChildren(List<? super GrandChildClass> grandChildren) {
		grandChildren.add(new GrandChildClass());
		System.out.println(grandChildren);
	}
	
}

class SuperClass {
    
}

class ChildClass extends SuperClass {
    
}

class GrandChildClass extends ChildClass {
    //
}
