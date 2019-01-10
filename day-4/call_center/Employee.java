public class Employee extends Person{
	String firstName;
	String middleName;
	String lastName;
	String email;
	int mobileNumber;
	String empId;
	Role role;


	public Employee(String firstName, String middleName, String lastName, String email, int mobileNumber, Role role) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.role = role;
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

	public void setRole(Role role) {
		this.role = role;
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
	public Role getRole() {
		return this.role;
	}
	public String getFullName() {
		return this.firstName + " "+ this.middleName + " "+this.lastName;
	}
}