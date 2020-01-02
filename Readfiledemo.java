package generics;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Readfiledemo {

	public static void main(String[] args) throws IOException {
		//String fs=File.separator;
		//File file=new File("c:"+fs+"Deloitte"+fs+"Batch"+fs+"notes.txt");
		File file=new File("mohan.txt");
		FileReader reader=new FileReader(file);
		int i=0;
		while((i=reader.read())!=-1)
		{
			System.out.print((char)i);
		}
		reader.close();

	}

}
