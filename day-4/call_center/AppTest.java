public class AppTest {
	public static void main(String[] args) {
		CallCenter callcenter = new CallCenter();

		Employee attende1 = new Employee("ravi", "kumar" ,"guru", "raviguruiitr@gmail.com", 9099, Role.MANAGER);
		callcenter.addEmployee(attende1);
		Employee attende2 = new Employee("ravi", "kumar" ,"guru", "raviguruiitr@gmail.com", 9099, Role.TEAMLEAD);
		callcenter.addEmployee(attende2);
		Employee attende3 = new Employee("ravi", "kumar" ,"guru", "raviguruiitr@gmail.com", 9099, Role.TRAINEE);
		callcenter.addEmployee(attende3);

		Employee attende4 = new Employee("ravi", "kumar" ,"guru", "raviguruiitr@gmail.com", 9099, Role.TRAINEE);
		callcenter.addEmployee(attende4);

		Caller caller1 = new Caller("anand", "kumar" ,"guru", "raviguruiitr@gmail.com", 989920);
		Call call1 = new Call(caller1, callcenter);
		System.out.println("**********************************************");
		Caller caller2 = new Caller("anand", "kumar" ,"guru", "raviguruiitr@gmail.com", 989920);
		Call call2 = new Call(caller2, callcenter);
		System.out.println("**********************************************");
		Caller caller3 = new Caller("anand", "kumar" ,"guru", "raviguruiitr@gmail.com", 989920);
		Call call3 = new Call(caller3, callcenter);
		System.out.println("**********************************************");
		Caller caller4 = new Caller("anand", "kumar" ,"guru", "raviguruiitr@gmail.com", 989920);
		Call call4 = new Call(caller4, callcenter);
		System.out.println("**********************************************");
		Caller caller5 = new Caller("anand", "kumar" ,"guru", "raviguruiitr@gmail.com", 989920);
		Call call5 = new Call(caller5, callcenter);
		call1.endCall();
	}
}
