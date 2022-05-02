/**
 * 
 */
package UML_umsetzen;

/**
 * @author emillySidaine
 *
 */
public class UML_U_Testklasse {
	
	public static void main(String[] args) {
		Library item_list = new Library();
		LibraryItem book1 = new Book("TitelBook", "Author1");
		LibraryItem blueray1 = new BlueRay("TitelBlueRay1", "Director1");
		LibraryItem blueray2 = new BlueRay("TitelBlueRay2", "Director2");
		
		testEinfügen(book1, item_list);
		testEinfügen(blueray1, item_list);
		testEinfügen(blueray2, item_list);
		printLibrary(item_list);
		
		System.out.println("The library contains " + item_list.getlibrarySize(item_list) + " items");
		
		testIsBorrowed(blueray1);
		
		testLöschen(item_list, blueray1);
		
		System.out.println("The library contains " +  item_list.getlibrarySize(item_list) + " items");
		
		testSingleSearch("TitelBook", item_list);
		testSingleSearch("Director1", item_list);
		
		testMultiSearch("TitelBook", "TitelBlueRay",item_list);
	}
	
	
		/**
	    * checks if adding works
	    *
	    * @param library_item the item of this Library
	    * @param item_list the Library (is a list)
	    *
	    */
	
	public static void testEinfügen(LibraryItem library_item, Library item_list) {
		item_list.addItem(library_item);
		System.out.println("The item " + library_item.getDescription() + " was added"); 
		//printLibrary(item_list);
		
	}
	
	
	/**
	    * checks if isBorrowed function works
	    *
	    * @param library_item the item of this Library
	    *
	    */
	
	public static void testIsBorrowed(LibraryItem library_item) {
		if(library_item.isBorrowed(library_item)) {
			System.out.println("The item " + library_item.getDescription() + " is borrowed");
		}else {
		System.out.println("The item" + library_item.getDescription() + " is available"); 
		}
	}
	
	

	
	/**
	    * checks if searching for one items works
	    *
	    * @param element the string we are searching for
	    * @param library_item the item of this Library
	    *
	    */
	public static void testSingleSearch(String element, Library item_list) {
		if(item_list.getlibrarySize(item_list.search(element)) == 0) {
		System.out.println("The Element was found in the following library items:"+ item_list.search(element));
		}
		else {
			System.out.println("Not found");
		}
	}
	
	
		/**
	    * checks if searching for multiple items works
	    *
	    * @param element1 the string we are searching for
	    * @param element2 the string we are searching for
	    * @param library_item the item of this Library
	    *
	    */
	public static void testMultiSearch(String element1, String element2, Library item_list) {
		System.out.println("The first element was found in the following library items:"); 
		//printLibrary(item_list.search(element1));
		System.out.println("The second element was found in the following library items:");
		//printLibrary(item_list.search(element2));
	}
	
		/**
	    * checks if deleting works
	    *
	    * @param library_item the item of this Library
	    * @param item_list the Library (is a list)
	    *
	    */
	public static void testLöschen( Library item_list, LibraryItem library_item) {
		if(library_item != null) {
		item_list.deleteItem(library_item);
		System.out.println("The item " + library_item.getDescription() + " was deleted");
		/*System.out.println("The Library contains now:"); 
		*printLibrary(item_list);
		*/
		}else {System.out.println("The item was not found");
		}
	}
	
	/**
	    * Prints the library items which have been added
	    *
	    * @param lib the Library (is a list)
	    *
	    */
	public static void printLibrary(Library lib) {
			while(!lib.item_list.endpos()) {
				LibraryItem next = (LibraryItem) lib.item_list.elem();
				System.out.println(next.getDescription());
				lib.item_list.advance();
			}
		}
	
}