package bookdatabasePackage;

import java.util.ArrayList;

class Library {
	//variable for the address
	String address;
	
	// Holds books
	ArrayList<Book> books = new ArrayList<Book>();
	//constructor
	public Library(String libraryAddress) {
		address = libraryAddress;
	}
	
	//add book function
	public void addBook(Book book) {
		books.add(book);
	}


	public void borrowBook(String bookTitle) {
		for (Book book : books) {
			if (book.getTitle().equals(bookTitle)) {
				if (!book.isBorrowed()) {
					book.borrowed();
					System.out.println("You successfully borrowed " + bookTitle);
				} else {
					System.out.println("Sorry, this book is already borrowed.");
				}
				return;
			}
		}
		System.out.println("Sorry, this book is not in our catalog.");
	}

	public void returnBook(String bookTitle) {
		for (Book book : books) {
			if (book.getTitle().equals(bookTitle)) {
				book.returned();
				System.out.println("You successfully returned " + bookTitle);
				return;
			}
		}
	}

	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from 9am to 5pm.");
	}

	public void printAddress() {
		System.out.println(address);
	}

	public void printAvailableBooks() {
		if (books.isEmpty()) {
			System.out.println("No book in catalog");
		} else {
			for (Book book : books) {
				if (!book.isBorrowed()) {
					System.out.println(book.getTitle());
				}
			}
		}
	}
}