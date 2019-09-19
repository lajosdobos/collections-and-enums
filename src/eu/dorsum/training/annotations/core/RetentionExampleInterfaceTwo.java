package eu.dorsum.training.annotations.core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface RetentionExampleInterfaceTwo {
	     
    String name() default "default-name";
    String desc() default "default-desc";
    
}