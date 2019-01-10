import java.util.*;
import java.util.Queue;

public class CallCenter {
	HashMap<Role, Queue<Employee>> attendee;
	HashMap<Call,Employee> onGoingCall;
	Queue<Call> callQueue;

	public CallCenter() {
		this.attendee = new HashMap<Role, Queue<Employee>>();
		this.onGoingCall = new HashMap<Call, Employee>();
		this.callQueue = new LinkedList<Call> ();
		this.attendee.put(Role.TRAINEE, new LinkedList<Employee>());
		this.attendee.put(Role.TEAMLEAD, new LinkedList<Employee>());
		this.attendee.put(Role.MANAGER, new LinkedList<Employee>());
	}
	
	public void addEmployee(Employee employee) {
		this.attendee.get(employee.getRole()).add(employee);
	}

	public boolean isEmployeeAvailable(Role role) {
		if(this.attendee.get(role).size() == 0) {
			return false;
		}
		return true;
	}

	public Employee getAvailableEmployee(Role role) {
		return this.attendee.get(role).poll();
	}
	
	public Employee getFirstAvailableEmployee() {
		
		if(this.isEmployeeAvailable(Role.TRAINEE)) {
			return this.getAvailableEmployee(Role.TRAINEE);
		}
		else if(this.isEmployeeAvailable(Role.TEAMLEAD)) {
			return this.getAvailableEmployee(Role.TEAMLEAD);
		}
		else if(this.isEmployeeAvailable(Role.MANAGER)) {
			return this.getAvailableEmployee(Role.MANAGER);
		}

		return null;
	}

	public boolean assignAttende(Call call) {
		Employee emp = this.getFirstAvailableEmployee();
		if(emp != null) {
			System.out.println("Your call is going to assign::"+emp.role);
			call.assignCaller(emp);
			return true;
		}
		else {
			System.out.println("Currently our employee is busy and your call is waiting");
			call.setCallStatus(CallStatus.WAITING);
			callQueue.add(call);
			return false;
		}
	}

	public void freeAttende(Employee employee) {
		this.attendee.get(employee.role).add(employee);

		if(this.callQueue.size() > 0) {
			if(this.assignAttende(this.callQueue.peek())) {
				this.callQueue.remove();
			}
		}
		
	}

 
}