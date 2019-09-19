package eu.dorsum.training.enumerators;

public enum Book {

	THE_INSTITUTE("The Institute: A Novel","Stephen King",2019),
	HERE_TO_STAY("Here To Stay","Mark Edwards",2019),
	B1984("1984", "George Orwell", 1949);
	
	private String title;
	private String author;
	private int year;
	
	private Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
}
