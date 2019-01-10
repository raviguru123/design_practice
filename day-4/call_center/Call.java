import java.text.SimpleDateFormat; 
import java.time.format.DateTimeFormatter;   
import java.time.LocalDateTime;    

public class Call {
	public Employee attendee;
	public Caller caller;
	public String startTime;
	public String endTime;
	public CallCenter callCenter;
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	public CallStatus callStatus;

	public Call(Caller caller, CallCenter callCenter){
		this.caller = caller;
		this.callCenter = callCenter;
		this.setCallStatus(CallStatus.CALLING);
		this.callCenter.assignAttende(this);

	}
	public void assignCaller(Employee attendee) {
		this.setAttendee(attendee);
		this.setCallStatus(CallStatus.ONGOING);
		this.startTime = dtf.format(LocalDateTime.now());
	}

	public void endCall() {
		this.endTime = dtf.format(LocalDateTime.now());
		this.setCallStatus(CallStatus.COMPLETED);
		System.out.println("Call end start time::"+this.startTime +" And end Time::"+this.endTime);
		this.callCenter.freeAttende(this.attendee);
	}
	
	public void setCallStatus(CallStatus callStatus) {
		this.callStatus = callStatus;
	}

	public CallStatus getCallStatus() {
		return this.callStatus;
	}

	public void setAttendee(Employee attendee) {
		this.attendee = attendee;
	}

	public void setCaller(Caller caller) {
		this.caller = caller;
	}

	public Employee getAttenee() {
		return this.attendee;
	}

	public Caller getCaller() {
		return this.caller;
	}
}