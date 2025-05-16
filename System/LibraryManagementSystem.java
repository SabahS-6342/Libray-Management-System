package library;

import java.util.*;
public class LibraryManagementSystem {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BookLinkedList bl = new BookLinkedList();
		BookQueue q = new BookQueue();
		Book b1 = new Book("The Catcher in the Rye", "J.D. Salinger");
		Book b2 = new Book("To Kill a Mockingbird", "Harper Lee");
		Book b3 = new Book("1984", "George Orwell");
		bl.addBook(b1);
		bl.addBook(b2);
		bl.addBook(b3);
		char yn;
		do {
			System.out.print("You want to: \na)Add a book \nb)Search for a book \nc)Delete a book \nd)Show books by author \ne)Show all books \nf)Enter book for reservation \ng)Show the list of people who reserved books \nYour choice: ");
			char ch = s.next().charAt(0);
			s.nextLine();
			String t, a, p;
			if (ch == 'a') {
				System.out.print("\nTo add a book please fill out the following: \nEnter the title of the book: ");
				t = s.nextLine();
				System.out.print("Enter the name of the author of the book: ");
				a = s.nextLine();
				Book b = new Book(t, a);
				bl.addBook(b);
				System.out.println(b.title + " by " + b.author + " was added successfully!");
			} else if (ch == 'b') {
				System.out.print("\nEnter the name of the book that you want to find: ");
				t = s.nextLine();
				bl.searchForABook(t);
			} else if (ch == 'c') {
				System.out.print("\nEnter the name of the book you want to delete: ");
				t = s.nextLine();
				bl.deleteBook(t);
			} else if (ch == 'd') {
				System.out.print("\nEnter the name of the author: ");
				a = s.nextLine();
				bl.displayByAuthor(a);
			} else if (ch == 'e') {
				System.out.println();
				bl.displayBooks();
			} else if (ch == 'f') {
				System.out.print("\nEnter the name of the person: ");
				p = s.nextLine();
				System.out.print("\nEnter the name of the book they want to reserve: ");
				t = s.nextLine();
				Book b5 = bl.getBook(t);
				Person per = new Person(p, b5);
				q.enqueue(per);
				System.out.println(per.name + " reserved " + per.book.title + " by " + per.book.author + " successfully");
			} else if (ch == 'g') {
				System.out.println();
				q.display();
			} else {
				System.out.println("Instruction is not available please check and enter the correct letter");
			}
			System.out.println("\nPerform another instruction ? ");
			yn = s.next().charAt(0);
			System.out.println();
			s.nextLine();
		} while (yn == 'y' || yn == 'Y');
	}
}
