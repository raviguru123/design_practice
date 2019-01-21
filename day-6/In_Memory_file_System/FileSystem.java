
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
			//System.out.println("ls name::"+name);
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

	}

	public String readContentFromFile(String path) {
		return "";
	}
}