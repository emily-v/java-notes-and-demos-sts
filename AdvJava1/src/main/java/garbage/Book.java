package garbage;

public class Book {
	private String name;
	private int pages;
	
	public Book(String name, int pages) { // right click, Source -> generate constructor using fields
		super();
		this.name = name;
		this.pages = pages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	@Override // annotation that says not to compile unless it's overriding something
	public String toString() { // overriding Object's toString method
		return "Hello I am a book. Title: " + this.name + " I am " + this.pages + " pages";
	}
	
	@Override
	public void finalize() { // using finalize is a bad practice
		System.out.println("The book " + this.name + " has been collected.");
	}
}
