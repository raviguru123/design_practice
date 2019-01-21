import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public abstract class Folder {
	String name;
	String createdAt;
	String updatedAt;
	String type;
	public Folder(String name) {
		this.name = name;
		this.createdAt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
		this.updatedAt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
	}
	
	public void setName(String name) {
		this.name = name;
		this.updatedAt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
	}
	
	public String getName() {
		return this.name;
	}
}