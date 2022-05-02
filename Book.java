package UML_umsetzen;

public class Book extends LibraryItem{
	
		/*
	    * the title of this Book
	    */
	
	private String title;
		/*
	    * the author of this Book
	    */
	
	private String author;
	
		/**
	    * Constructor setting the title and author of this Book.
	    *
	    * @param title the title of this Book
	    * @param author the author of this Book
	    */
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
		/**
	    * Returns the title of this Book.
	    *
	    * @return the title of this Book
	    */
	public String getTitle() {
		return title;
	}
		/**
	    * Returns the author of this Book.
	    *
	    * @return the author of this Book.
	    */
	public String getAuthor() {
		return author;
	}
	
	
		/** 
	    * 
	    * implements the method getDesription()
	    *
	    * @return title and author of the Book
	    */
	@Override
	public String getDescription() {
		return this.getTitle() + " by " + this.getAuthor();  
	}
}
