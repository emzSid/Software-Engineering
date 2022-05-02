package UML_umsetzen; 
public class Library  {
	
		/*
	    * list which contains all library items
	    */
	public List item_list;
	
		/*
	    * how many items the library contains
	    */
	public int libSize;
	
	
		/**
	    * Constructor generating an empty list.
	    *
	    */
	public Library() {
		item_list = new List(); 
	}
	
		/**
	    * Returns the size of this Library.
	    *
	    * @return the size of this Library
	    */
	public int getlibrarySize(Library item_list) {
		return item_list.libSize;
	}
	
		/**
	    * adds the library item to the library
	    *
	    */
	public void addItem(LibraryItem library_item) {
		this.libSize++;
		item_list.add(library_item);
	}
	
		/**
	    * deletes the library item from the library
	    * 
	    * iterates over the list, searches the respective library item and deletes it 
	    */
	public void deleteItem(LibraryItem library_item) {
		item_list.reset();
		while(!item_list.endpos()) {
			LibraryItem next = (LibraryItem) item_list.elem();
			if(next.equals(library_item)) {
				this.libSize--;
				item_list.delete();
			}else {
				item_list.advance();
			}
		}
	}
		/**
	    * Searches in all library items in the library if the respective
	    * description contains the string text
	    * 
	    * iterates over the list, accesses the description of the item and 
	    * checks if the description contains text
	    * 
	    * @return library with library items which contain the string text
	    */
	
	public Library search(String text) {
		Library true_list = new Library();
		while(!item_list.endpos()) {
			LibraryItem next = (LibraryItem) item_list.elem();
			String description = next.getDescription();
			if(description.contains(text)){
				true_list.addItem(next);
			}
			item_list.advance();
		}	
		return true_list;
	}
	

}
