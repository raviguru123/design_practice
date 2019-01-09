import java.util.HashMap;
public class Library {
	HashMap<Integer, Book> books;

	public Library() {
		this.books = new HashMap<Integer, Book>();
	}

	public boolean addBook(String name, String title, String description, int id) {
		if(this.books.containsKey(id)) {
			return false;
		}

		Book book = new Book(name, title, description, id);
		this.books.put(book.getId() ,book);
		return true;
	}

	public boolean addBook(Book book) {
		if(this.books.containsKey(book.getId())) {
			return false;
		}
		this.books.put(book.getId(), book);
		return true;
	}

	public boolean remove(Book book) {
		return this.remove(book.getId());
	}

	public boolean remove(int id) {
		if(this.books.containsKey(id)) {
			this.books.remove(id);
			return true;
		}
		return false;
	}

	public Book find(int id) {
		return this.books.get(id);
	}

	public Book find(Book book) {
		return this.books.get(book.getId());
	}
}