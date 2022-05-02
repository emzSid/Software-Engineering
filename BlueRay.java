package UML_umsetzen;
/**
 * Every BlueRay represents an item in a Library.
 *
 * @author Emilly Sidaine
 */
public class BlueRay extends LibraryItem{
	   /*
	    * the title of this BlueRay
	    */
	
	private String title;
		/*
	    * the director of this BlueRay
	    */
	
	private String director;
	
		/**
	    * Constructor setting the title and director of this BlueRay.
	    *
	    * @param title the title of this BlueRay
	    * @param director the director of this BlueRay
	    */
	
	public BlueRay(String title, String director) {
		this.title = title;
		this.director = director;
	}
		/**
	    * Returns the title of this BlueRay.
	    *
	    * @return the title of this BlueRay
	    */
	
	public String getTitle() {
		return this.title;
	}
		/**
	    * Returns the director of this BlueRay.
	    *
	    * @return the director of this BlueRay
	    */
	
	public String getDirector() {
		return this.director;
	}
	
		/** 
	    * 
	    * implements the method getDesription()
	    *
	    * @return title and director of the BlueRay
	    */
	@Override
	public String getDescription() {
		return  this.getTitle() + " by " + this.getDirector();  
	}
}
