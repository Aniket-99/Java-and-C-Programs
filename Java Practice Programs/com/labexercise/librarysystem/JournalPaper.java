package com.labexercise.librarysystem;

public class JournalPaper extends WrittenItem {
	private int yearPublished;

	public JournalPaper() {
		super();
	}

	public JournalPaper(int identificationNumber, int numberOfCopies, String title, String author, int yearPublished) {
		super(identificationNumber,numberOfCopies, title, author);
		this.yearPublished = yearPublished;
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

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	
	public void print() {
		super.print();
		System.out.println("Year published: "+getYearPublished());
	}

}
