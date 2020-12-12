package com.labexercise.librarysystem;

public class Book extends WrittenItem {
	public Book() {

	}

	// public Book(int identificationNumber, int numberOfCopies, String title) {
	// super(identificationNumber, numberOfCopies, title);
	// }

	public void print() {
		System.out.println("Displaying info about book");
		super.print();
	}

	public void checkIn() {
		super.checkIn();
	}

	public void checkOut() {
		super.checkOut();
	}

	public void addItem() {
		super.addItem();
	}

	public String toString() {
		return super.toString();
	}

	public int getIdentificationNumber() {
		return super.getIdentificationNumber();
	}

	public String getTitle() {
		return super.getTitle();
	}

	public int getNumberOfCopies() {
		return super.getNumberOfcopies();
	}

	public String getAuthor() {
		return super.getAuthor();
	}
}
