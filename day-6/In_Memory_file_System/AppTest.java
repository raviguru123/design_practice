public class AppTest {
	public static void main(String[] args) {
		String path = "/a/b/c";
		FileSystem fs = new FileSystem();
		fs.mkdir(path);
		fs.mkdir("/a/b/d");
		fs.mkdir("/a/b/e/g");
		fs.ls("/a/b/");
		fs.ls("/a/b/e/");
		fs.addContent("/b/c/d/ravi.txt", "hello i am ravi");

		fs.addContent("/e/b/c/d/e/g/ravi.txt", "hello i am ravi form nested level");
		String content = fs.readContentFromFile("/b/c/d/ravi.txt");
		System.out.println("read content="+content);
		content = fs.readContentFromFile("/e/b/c/d/e/g/ravi.txt");
		System.out.println("read content="+content);
	}
}