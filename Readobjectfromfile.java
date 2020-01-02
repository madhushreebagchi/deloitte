package generics;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//deserialization
public class Readobjectfromfile {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Customess custom=new Customess();
		ObjectInputStream stream=new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("delu.txt"))));
		custom=(Customess)stream.readObject();
		System.out.println(custom);

	}

}
