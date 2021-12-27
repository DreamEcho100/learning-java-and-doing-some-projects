import java.io.File;

public class Main {

	public static void main(String[] args) {
		File file1 = new File("secret_message.txt");
		
		if (file1.exists()) {
			System.out.println("The file exists :)");
			System.out.println("Relative path: " + file1.getPath());
			System.out.println("Absolute path: " + file1.getAbsolutePath());
			System.out.println("Is it a file?: " + file1.isFile());
			// file1.deleteOnExit();
		} else {
			System.out.println("The file doesn't exist :(");
		}
	}

}
