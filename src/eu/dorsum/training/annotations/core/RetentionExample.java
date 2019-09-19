package eu.dorsum.training.annotations.core;

import java.lang.reflect.Method;

public class RetentionExample {

    @RetentionExampleInterface(name = "test1", desc = "testing annotations")
    public void myTestMethod(){
    	
    	try {
    		Class<? extends RetentionExample> clazz = this.getClass();
    		Method method = clazz.getMethod("myTestMethod");
    		RetentionExampleInterface retentionExampleInterface = method.getAnnotation(RetentionExampleInterface.class);

    		System.out.println("desc: " + retentionExampleInterface.desc());
    		System.out.println("name: " + retentionExampleInterface.name());
    	} catch (SecurityException | NoSuchMethodException e) {
    		System.err.println(e);
        } 
    }
    
    public static void main(String[] args) {
		RetentionExample retentionExample = new RetentionExample();
		retentionExample.myTestMethod();
	}
    
}
