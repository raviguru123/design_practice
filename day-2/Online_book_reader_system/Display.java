public class Display {
	Book activebook;
	User activeuser;
	int pagenumber;

	public Display() {
		// this.activeuser = activeuser;
		// this.activebook = activebook;
		// this.pagenumber = 0;
	}

	public boolean turnPageForward() {
		this.pagenumber += 1;
		this.refreshPage();
		return true;
	}

	public boolean turnPageBackward() {
		if(this.pagenumber > 0) {
			this.pagenumber -= 1;
			return true;
		}
		return false;
	}

	public void setActiveUser(User user) {
		this.activeuser = user;
		this.refreshUser();
	}

	public void setActiveBook(Book book) {
		this.activebook = book;
		this.refreshBook();
	}

	public User getActiveUser() {
		return this.activeuser;
	}

	public Book getActiveBook() {
		return this.activebook;
	}

	public void refreshUser() {
		System.out.println("Refresh User :: "+ this.activeuser.name);
	}

	public void refreshBook() {
		this.pagenumber = 0;
		this.refreshTitle();
		this.refreshDescription();
		this.refreshPage();
	}

	public void refreshPage() {
		System.out.println("Refresh Page :: "+ this.activebook.name);
	}

	public void refreshTitle() {
		System.out.println("Refresh title :: "+this.activebook.name);
	}

	public void refreshDescription() {
		System.out.println("Refresh description :: "+ this.activebook.name);
	}
} 