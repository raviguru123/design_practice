import java.util.HashMap;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Directive extends Folder {
	HashMap<String, Folder> content;
	
	public Directive(String name) {
		super(name);
		this.content = new HashMap<String, Folder>();
		this.type = "dir";
	}

	public void createDir(String path) {
		if(path != null && !path.isEmpty()) {
			String name = "";
			boolean recur = false;
			if(path.indexOf("/") >0) {
				name = path.substring(0,path.indexOf("/"));
				recur = true;
			}
			else {
				name = path;
			}
			
			Folder dir = this.content.get(name);
			if(dir == null) {
				Directive dir1 = new Directive(name);
				this.content.put(name, dir1);
				if(recur) {
					path = path.substring(path.indexOf(name)+name.length()+1, path.length());
					dir1.createDir(path);	
				}
				
			}
			else if (dir instanceof File) {
				return;
			}
			else {
				Directive dir1 = (Directive)this.content.get(name);
			    path = path.substring(path.indexOf(name)+name.length()+1, path.length());
			    dir1.createDir(path);
			}
		 }
	}
}