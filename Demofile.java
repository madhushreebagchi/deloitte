package generics;
import java.io.File;
import java.io.IOException;
public class Demofile {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Deloitte\\Core java\\newyear.txt");
		File h=new File("c:\\Deloitte\\K\\T\\.K");
		if(file.exists())
		{
			System.out.println("File is there.. Go and see yourself");
			file.delete();
		}
		else
		{
			h.mkdirs();
			file.createNewFile();
			System.out.println("New File created.. Go and see yourself");
		}
		System.out.println("Done");
	}

}
