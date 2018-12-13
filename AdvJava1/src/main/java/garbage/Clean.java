package garbage;

public class Clean {

	public static void main(String[] args) {
		
		// Garbage collection:
		// Once an object is no longer reachable or referenced in the code, it is marked for garbage collection aka deletion
		// Objects have a finalize method that is called when an item is garbage collected
		
		Book w = new Book("Wuthering Heights", 270);
		
		// w, rather than pointing to a book, now points to nothing
		//w = null;
		
		destroy(w); // does not make w garbage collected because destroy sets COPY of w to null. "Pass by value"
		
		// System.gc() requests that all objects marked for collection to be collected
		System.gc();
	}
	
	// In Java you cannot destroy objects
	public static void destroy(Book c) {
		c = null;
	}
	
}
