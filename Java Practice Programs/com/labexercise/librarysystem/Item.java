package com.labexercise.librarysystem;

public abstract class Item {
	private int identificationNumber, numberOfcopies;
	private String title;

	public Item() {

	}

	public Item(int identificationNumber, int numberOfcopies, String title) {
		this.identificationNumber = identificationNumber;
		this.numberOfcopies = numberOfcopies;
		this.title = title;
	}
	
	abstract void addItem();

	public void addItem(int identificationNumber, int numberOfCopies, String title) {
		setIdentificationNumber(identificationNumber);
		setNumberOfcopies(numberOfCopies);
		setTitle(title);
		numberOfCopies++;
	}

	public void checkIn() {
		numberOfcopies = numberOfcopies + 1;
	}

	public void checkOut() {
		numberOfcopies = numberOfcopies - 1;
	}

	public void print() {
		System.out.println("Id is: " + identificationNumber);
		System.out.println("Title is: " + title);
		System.out.println("Number of copies: " + numberOfcopies);
	}

	public int getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public int getNumberOfcopies() {
		return numberOfcopies;
	}

	public void setNumberOfcopies(int numberOfcopies) {
		this.numberOfcopies = numberOfcopies;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + identificationNumber;
		result = prime * result + numberOfcopies;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (identificationNumber != other.identificationNumber)
			return false;
		if (numberOfcopies != other.numberOfcopies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Item [identificationNumber=" + identificationNumber + ", numberOfcopies=" + numberOfcopies + ", title="
				+ title + "]";
	}

}
