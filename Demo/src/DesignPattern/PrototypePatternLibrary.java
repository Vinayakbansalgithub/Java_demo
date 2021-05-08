package DesignPattern;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
class Book implements Cloneable {
	private Long id;
	private String name;
	private String author;

	public Book(Long id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}

	protected Book clone() throws CloneNotSupportedException {
		Book book = new Book(this.id, this.name, this.author);
		return book;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	
}

@Getter
@Setter
@ToString
public class PrototypePatternLibrary {
	private String name;
	private List<Book> books;

	public PrototypePatternLibrary(String name) {
		this.name = name;
		this.books = new ArrayList<>();
	}

	public void initialize() {
		// let’s suppose list is coming from database
		for (int i = 0; i < 10; i++) {
			Book book = new Book(Long.valueOf(i), "Book-" + i, "Author-" + i);
			this.books.add(book);
		}

	}

	@Override
	public String toString() {
		return "PrototypePatternLibrary [name=" + name + ", books=" + books + "]";
	}

	@Override
	protected PrototypePatternLibrary clone() throws CloneNotSupportedException {
		PrototypePatternLibrary libCopy = new PrototypePatternLibrary(null);
//		for (Book book : this.getBooks()) {
//			libCopy.getBooks().add(book.clone());
//		}

		for (Book book : this.books) {
			libCopy.books.add(book.clone());
		}

		return libCopy;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		PrototypePatternLibrary lib = new PrototypePatternLibrary("Old Delhi Library, Delhi");
		lib.initialize();
		System.out.println(lib);
		PrototypePatternLibrary lib2 = lib.clone();
		// lib2.setName("Morden Library, CP");
		lib2.name = "Morden Library, CP";
		System.out.println(lib2);
	}
}

//The Prototype pattern is generally used when we have an instance of the class (prototype) and 
//we'd like to create new objects by just copying the prototype.
//
//Let's use an analogy to better understand this pattern.
//
//In some games, we want trees or buildings in the background.
//We may realize that we don't have to create new trees or buildings and render them on the screen every time the character moves.
//
//So, we create an instance of the tree first. 
//Then we can create as many trees as we want from this instance (prototype) and update their positions. 
//We may also choose to change the color of the trees for a new level in the game.
//
//
//
//This pattern is handy when our new object is only slightly different from our existing one
