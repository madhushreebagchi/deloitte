package generics;
import java.io.File;
import java.io.IOException;
public class Demoio {

	public static void main(String[] args) throws IOException {
		
		File file=new File("c:\\Deloitte\\Batch\\BatchMates.txt");
		file.createNewFile();
		File folder=new File("c:\\Deloitte\\Batch");
		File f[]=folder.listFiles();
		for(File f1:f)
		{
			if(f1.isFile())
				System.out.println("The file is: "+f1.getName());
			if(f1.isDirectory())
			
				System.out.println("The directory is: "+f1.getName());
			
		}

	}

}
