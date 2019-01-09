import java.util.HashMap;

public class UserManagement {
	HashMap<String, User> users;

	public UserManagement() {
		this.users = new HashMap<String, User>();
	}

	public boolean addUser(String userid, String name, String email, int phone) {
		return this.addUser(new User(userid, name, email, phone));
	}

	public boolean addUser(User user) {
		if(this.users.containsKey(user.getUserId())) {
			return false;
		}
		this.users.put(user.getUserId(), user);
		return true;
	}

	public boolean remove(User user) {
		return this.remove(user.getUserId());
	}

	public boolean remove(String userid) {
		if(this.users.containsKey(userid)) {
			this.users.remove(userid);
			return true;
		}
		return false;
	}

	public User find(String userid) {
		return this.users.get(userid);
	}

}