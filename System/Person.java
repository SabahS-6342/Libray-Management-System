package library;

public class Person {
	public String name;
	public Person next;
	public Book book;
	public Person() {
		this.name = null;
		this.next = null;
		this.book = null;
	}
	public Person(String name, Book book) {
		this.name = name;
		this.next = null;
		this.book = book;
	}
}
