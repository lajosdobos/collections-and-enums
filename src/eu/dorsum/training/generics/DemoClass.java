package eu.dorsum.training.generics;

import java.lang.annotation.Documented;

class DemoClass<T> {
	   //T stands for "Type"
	   private T t; 
	   
	   public void set(T t) { this.t = t; }    
	   
	   public T get() { return t; }
	   
	   
	   public static <T> int countAllOccurrences(T[] list, T item) {
		   int count = 0;
		   if (item == null) {
		      for ( T listItem : list )
		         if (listItem == null)
		            count++;
		   }
		   else {
		      for ( T listItem : list )
		         if (item.equals(listItem))
		            count++;
		   }
		   return count;
		} 
	   
	}
