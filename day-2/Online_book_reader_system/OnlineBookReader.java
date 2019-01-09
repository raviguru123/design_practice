public class OnlineBookReader {
	Library library;
	UserManagement usermanagement;
	Display display;
	Book activebook;
	User activeuser;

	public OnlineBookReader() {
		this.library = new Library();
		this.usermanagement = new UserManagement();
		this.display = new Display();
	}

	public Library getLibrary() {
		return this.library;
	}

	public UserManagement getUserManagement() {
		return this.usermanagement;
	}

	public User getActiveUser() {
		return this.activeuser;
	}

	public Book getActiveBook() {
		return this.activebook;
	}

	public void setActiveUser(User user) {
		this.activeuser = user;
		this.display.setActiveUser(user);
	}

	public void setActiveBook(Book book) {
		this.activebook = book;
		this.display.setActiveBook(book);
	}

}