package library;
public class Book {
	String title, author;
	static int bookIdCounter = 0;
    int bookId;
	Book next;
	public Book() {
		this.title = this.author = null;
		this.bookId = ++bookIdCounter;
	}
	public Book(String t, String a) {
		this.title = t;
		this.author = a;
		this.bookId = ++bookIdCounter;
	}
}
	