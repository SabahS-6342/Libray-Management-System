package library;

class BookQueue {
	PersonLinkedList pll;
	private int people;
	public BookQueue() {
		pll = new PersonLinkedList();
		people = 0;
	}
	public boolean isEmpty() {
		return pll.isEmpty();
	}
	public void enqueue(Person p) {
		pll.insertPerson(p);
		people++;
	}

	public void dequeue() {
		pll.deleteFromFront();
		people--;
	}
	public void display() {
		pll.display();
	}
}
