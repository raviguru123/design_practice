public class AppTest {
	public static void main(String[] args) {
		String path = "/a/b/c";
		FileSystem fs = new FileSystem();
		fs.mkdir(path);
		fs.mkdir("/a/b/d");
		fs.mkdir("/a/b/e/g");
		fs.ls("/a/b/");
		fs.ls("/a/b/e/");
		//System.out.println(str.indexOf("a"));
	}
}