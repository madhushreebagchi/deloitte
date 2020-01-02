package generics;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
public class Writefiledemo {

	public static void main(String[] args) throws IOException {
		//FileOutputStream fw=new FileOutputStream("record.txt");
		FileWriter fw=new FileWriter("record.txt");
		fw.write("My name is Madhu");
		fw.close();
		System.out.println("Done");

	}

}
