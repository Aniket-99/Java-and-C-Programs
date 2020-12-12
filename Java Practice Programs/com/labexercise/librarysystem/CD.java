package com.labexercise.librarysystem;

public class CD extends MediaItem{
	private String artist, cdGenre;
	
	public CD() {
		super();
	}
	
	public CD(int identificationNumber, int numberOfCopies, String title, int runtime, String artist, String cdGenre) {
		super(identificationNumber,numberOfCopies,title, runtime);
		this.artist = artist;
		this.cdGenre = cdGenre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getCdGenre() {
		return cdGenre;
	}

	public void setCdGenre(String cdGenre) {
		this.cdGenre = cdGenre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((artist == null) ? 0 : artist.hashCode());
		result = prime * result + ((cdGenre == null) ? 0 : cdGenre.hashCode());
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
		CD other = (CD) obj;
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!artist.equals(other.artist))
			return false;
		if (cdGenre == null) {
			if (other.cdGenre != null)
				return false;
		} else if (!cdGenre.equals(other.cdGenre))
			return false;
		return true;
	}
	
	public void print() {
		super.print();
		System.out.println("Artist is: " + getArtist());
		System.out.println("Cd Genre is: " + getCdGenre());
	
	}

}
