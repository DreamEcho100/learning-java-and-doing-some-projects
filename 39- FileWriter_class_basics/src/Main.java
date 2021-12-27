import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("roses are red\nviolets are blue\nomae wa mou shindeiru");
			writer.append("\nnani!!!");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
