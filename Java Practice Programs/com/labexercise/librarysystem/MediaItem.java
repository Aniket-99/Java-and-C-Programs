package com.labexercise.librarysystem;

public abstract class MediaItem extends Item {
	private int runTime;

	public MediaItem() {
		super();
	}

	public MediaItem(int identificationNumber, int numberOfCopies, String title, int runtime) {
		super(identificationNumber, numberOfCopies, title);
		this.runTime = runtime;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public void addItem() {
		
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
		System.out.println("The runtime name is: " + getRunTime());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + runTime;
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
		MediaItem other = (MediaItem) obj;
		if (runTime != other.runTime)
			return false;
		return true;
	}

}
