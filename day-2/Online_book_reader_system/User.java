public class User {
	String userid;
	String name;
	String email;
	int phone;

	public User(String userid, String name, String email, int phone) {
		this.userid = userid;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUserId(String userid) {
		this.userid = userid;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getUserId() {
		return this.userid;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}
	
	public int getPhone() {
		return this.phone;
	}
}