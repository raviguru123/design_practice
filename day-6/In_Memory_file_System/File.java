import java.util.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class File extends Folder {
	String content = "";
	public File(String name) {
		super(name);
		this.type = "file";
	}
	public void addContent(String content) {
		this.content += content;
		this.updatedAt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
	}
	public String readContent() {
		return this.content;
	}
}