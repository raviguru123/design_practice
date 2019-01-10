public class Caller extends Person {
	String firstName;
	String middleName;
	String lastName;
	String email;
	int mobileNumber;
	String empId;
	public static final Role role = Role.CALLER;

	public Caller(String firstName, String middleName, String lastName, String email, int mobileNumber) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.empId = this.firstName+ "_"+this.lastName;
	} 

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getFirstName() {
		return this.firstName;
	}
	public String getMiddleName() {
		return this.middleName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getEmail() {
		return this.email;
	}
	public int getMobileNumber() {
		return this.mobileNumber;
	}
	public String getFullName() {
		return this.firstName + " "+ this.middleName + " "+this.lastName;
	}
}