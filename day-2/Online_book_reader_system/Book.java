public class Book {
	public String name;
	public String title;
	public String description;
	public int id;

	public Book(String name, String title, String description, int id) {
		this.name = name;
		this.title = title;
		this.description = description;
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public String getTitle() {
		return this.title;
	}

	public String getDescription() {
		return this.description;
	}

	public int getId() {
		return this.id;
	}

}