package eu.dorsum.training.exceptions;

public class CatchBlocksExample {

	public void doA() throws ExceptionA {
		//logic
		throw new ExceptionB();
	}
	
	public void doB() throws ExceptionB {}
	
	public static void main(String[] args) {
		
	String result = "";
	  String v = null;
	   try {
	      try {
	        result += "before";
	        v.length();
	        result += "after";
	      } catch (NullPointerException e) {
	       result += "catch";
	       throw new RuntimeException();
	      } catch(RuntimeException e) {
	    	  throw new ExceptionA();
	      } finally {
	       result += "finally";
	       throw new Exception();
	      }
	   } catch (RuntimeException e) {
		 result += e.getClass();
//	     result += "done";
	   } catch(Exception e) {
		   result += e.getClass();
	   }
	   
	   System.out.println(result);		
	}
	
}
