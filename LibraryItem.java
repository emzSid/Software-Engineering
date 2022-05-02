package UML_umsetzen;

public abstract class LibraryItem extends Library{
	 	
		/*
	    * if the library item is borrowed
	    */
	private boolean isBorrowed;
	
		/**
	    * Constructor setting the isBorrowed to false
	    *
	    */
	public LibraryItem() {
		isBorrowed = false;
	}
	
		/**
	    * Returns if the library item is borrowed
	    *
	    * @param library_item the item of this Library
	    *
	    */
	public boolean isBorrowed(LibraryItem library_item) {
		return library_item.isBorrowed;
	}
	
		/**
	    * Sets isBorrowed to true
	    *
	    * @param isBorrowed boolean which describes if the item is borrowed
	    *
	    */
	public void setBorrowed(boolean isBorrowed) {
		this.isBorrowed = true;
	}
	
		/**
	    *abstract method which should give title and maker of the item
	    *
	    */
	abstract public String getDescription();
	
}
