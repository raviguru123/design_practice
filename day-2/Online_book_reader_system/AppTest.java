public class AppTest {
	public static void main(String[] args) {
		//System.out.println("Hello this is java first program");

		OnlineBookReader onlinebookreader = new OnlineBookReader();

		UserManagement usermangement = onlinebookreader.getUserManagement();
		usermangement.addUser("1", "first", "first@email.com", 989920);
		usermangement.addUser("2", "second", "second@email.com", 989921);

		Library library = onlinebookreader.getLibrary(); 
		library.addBook("head first", "design pattern", "heade first design pattern", 1);
		library.addBook("the secret", "the secret of life", "Pschyology book", 2);

		onlinebookreader.setActiveUser(usermangement.find("1"));
		onlinebookreader.setActiveBook(library.find(2));

		System.out.println("*****************************************");
		onlinebookreader.setActiveUser(usermangement.find("2"));
		//onlinebookreader.setActiveBook(library.find(1));

	}
}