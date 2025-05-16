package library;

public class PersonLinkedList {
	Person first = new Person();
	public PersonLinkedList() {
		this.first = null;
	}
	public boolean isEmpty() {
		return this.first == null;
	}
	public void insertPerson(Person p) {
		Person current = this.first;
		if (isEmpty()) {
			p.next = null;
			this.first = p;
		} else {
			while (current.next != null) {
				current = current.next;
			}
			p.next = null;
			current.next = p;
		}
	}
	public void display() {
		Person current = this.first;
		if (isEmpty())
			System.out.println("This list is empty.");
		else {
			while (current.next != null) {
				System.out.println(current.name + " reserved " + current.book.title + " by " + current.book.author);
				current = current.next;
			}
			System.out.println(current.name + " reserved " + current.book.title + " by " + current.book.author);
		}
	}
	public void deleteFromFront() {
		if (isEmpty())
			System.out.println("This list is empty.");

		else {
			this.first = this.first.next;
		}
	}
}
