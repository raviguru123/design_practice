public abstract class Person {
	public String firstName;
	public String middleName;
	public String lastName;
	public String email;
	public int mobileNumber;

	public abstract void setFirstName(String firstName);
	public abstract void setMiddleName(String middleName);
	public abstract void setLastName(String lastName);
	public abstract void setEmail(String email);
	public abstract void setMobileNumber(int mobileNumber);

	public abstract String getFirstName();
	public abstract String getMiddleName();
	public abstract String getLastName();
	public abstract String getEmail();
	public abstract int 	  getMobileNumber();
	public abstract String getFullName();
}