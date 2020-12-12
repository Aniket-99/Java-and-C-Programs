package com.labexercise.librarysystem;

public abstract class WrittenItem extends Item {
	private String author;

	public String getAuthor() {
		return author;
	}
	
	public WrittenItem() {
		
	}
	
	public WrittenItem(int identificationNumber, int numberOfcopies, String title, String author) {
		super(identificationNumber, numberOfcopies, title);
		this.author = author;
	}
	
	
	public void addItem() {
		
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getIdentificationNumber() {
		return super.getIdentificationNumber();
	}

	public int getNumberOfcopies() {
		return super.getNumberOfcopies();
	}

	public String getTitle() {
		return super.getTitle();
	}
	
	public void print() {
		super.print();
		System.out.println("The author name is: "+getAuthor());
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		WrittenItem other = (WrittenItem) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		return true;
	}
	
	

}
