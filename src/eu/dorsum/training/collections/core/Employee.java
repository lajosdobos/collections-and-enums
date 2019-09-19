package eu.dorsum.training.collections.core;

import eu.dorsum.training.enumerators.Book;
import eu.dorsum.training.enumerators.Day;

public class Employee {

	private String name;
	private int age;
	private double salary;	
	private Book favBook;
	
	public Employee(String name, int age, double salary, Book favBook) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.favBook = favBook;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Book getFavBook() {
		return favBook;
	}
	public void setFavBook(Book favBook) {
		this.favBook = favBook;
	}

}
