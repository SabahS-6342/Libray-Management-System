package library;

public class BookLinkedList {
	private Book head;
	public boolean isEmpty() {
		return (this.head == null);
	}
	public void addBook(Book book) {
		Book current = this.head;

		if (isEmpty()) {
			book.next = null;
			this.head = book;
		} else {
			while (current.next != null) {
				current = current.next;
			}
			book.next = null;
			current.next = book;
		}
	}
	public void displayBooks() {
		Book current = head;
		while (current != null) {
			System.out.println(current.title + " by " + current.author + " Book ID: " + current.bookId);
			current = current.next;
		}
	}
	public void displayByAuthor(String a) {
	    if (numOfBooksByAuthor(a) == 0)
	        System.out.println("No books by this author were found");
	    else {
	        System.out.println("There is/are " + numOfBooksByAuthor(a) + " book(s) by: " + a);
	        Book current = head;
	        while (current != null) {
	            if (current.author.equals(a))
	                System.out.println("Book ID: " + current.bookId + ", Title: " + current.title);
	            current = current.next;
	        }
	    }
	}
	public void searchForABook(String t) {
		Book current = head;
		while (current != null) {
			if (current.title.equalsIgnoreCase(t)) {
				System.out.println(current.title + " by " + current.author + " was found");
				return;
			}
			current = current.next;
		}
		System.out.println("The book was not found");
	}
	public boolean searchBook(String t) {
		Book current = head;
		boolean flag = false;
		while (current != null) {
			if (current.title.equalsIgnoreCase(t)) 
				flag = true;
			current = current.next;
		}
		return flag;
	}
	public Book getBook(String t) {
		Book current = head;
	    while (current != null) {
	        if (current.title.equalsIgnoreCase(t)) {
	            return current;
	        }
	        current = current.next;
	    }
		return null;
	}
	public void deleteBook(String t) {
		if (head == null) {
			System.out.println("The list is empty. Cannot delete.");
			return;
		}
		if (head.title.equals(t)) {
			head = head.next;
			System.out.println("Book '" + t + "' deleted successfully.");
			return;
		}
		Book current = head;
		while (current.next != null && !current.next.title.equals(t)) {
			current = current.next;
		}
		if (current.next != null) {
			current.next = current.next.next;
			System.out.println("Book '" + t + "' deleted successfully.");
		} else {
			System.out.println("Book '" + t + "' not found.");
		}
	}
	public int numOfBooksByAuthor(String a) {
		int c = 0;
		Book current = head;
		if (isEmpty())
			c = -1;
		else {
			while (current != null) {
				if (current.author.equals(a))
					c++;
				current = current.next;
			}
		}
		return c;
	}
}
