package generics;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Createfile {

	public static void main(String[] args) throws IOException {
		
		File file=new File("mohan.txt");
		file.createNewFile();
		
	}

}
