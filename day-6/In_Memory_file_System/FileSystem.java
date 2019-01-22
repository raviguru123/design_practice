import java.util.*;

public class FileSystem {
	Directive dir = new Directive("/");
	public FileSystem() {

	}

	public void ls(String path) {
		this._printContent(this.dir, path.substring(1,path.length()));
	}

	public void _printContent(Directive dir, String path) {
		if(path.indexOf("/") < 0) {
			for(String name : dir.content.keySet()) {
				System.out.print(name+" ");
			}
			System.out.println("");
		}
		else {
			String name = path.substring(0,path.indexOf("/"));
			if(dir.content.get(name) != null) {
				Directive directive = (Directive) dir.content.get(name);
				this._printContent(directive, path.substring(path.indexOf("/")+1, path.length()));
			}
			else {
				System.out.println("Invalid Directory Structure");
			}
		}
	}

	public void mkdir(String path) {
		this.dir.createDir(path.substring(1,path.length()));
	}

	public void addContent(String path, String content) {
		String updatetedPath = path.substring(0, path.lastIndexOf("/"));
		this.mkdir(updatetedPath);
		String[] paths = path.split("/");
		Directive dir = this.dir;
		String FileName = path.substring(path.lastIndexOf("/")+1, path.length());
		System.out.println("FileName="+FileName);
		for(String dirPath : paths) {
			if(dirPath != null && !dirPath.isEmpty()) {
				if(FileName.equals(dirPath)) {
					File file = new File(FileName);
					dir.content.put(FileName, file);
					file.addContent(content);
				}
				else{

					dir =(Directive)dir.content.get(dirPath);
				}
			}
		}
	}

	public String readContentFromFile(String path) {
		String dirPath = path.substring(0,path.lastIndexOf("/"));
		String[] paths = path.split("/");
		String FileName = path.substring(path.lastIndexOf("/")+1, path.length()); 
		Directive dir = this.dir;
		for(String newDirPath : paths) {
			if(newDirPath != null && !newDirPath.isEmpty()) {
				if(FileName.equals(newDirPath)) {
					File file = (File)dir.content.get(FileName);
					return file.readContent();
				}
				else if(dir.content.containsKey(newDirPath)) {
					dir = (Directive)dir.content.get(newDirPath);
				}
				else {
					return "null";
				}
			}
		}
		return null;
	}
}