package generics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filereadwritedemo {

	public static void main(String[] args) throws IOException {
		while(true) {
		Scanner sc=new Scanner(System.in);
		String readFile,writeFile;
		System.out.println("Enter the file to copy");
		readFile=sc.next();
		File filetoRead=new File(readFile);
		if(filetoRead.exists())
		{
			System.out.println("Enter the file to paste");
			writeFile=sc.next();
			File fileToWrite=new File(writeFile);
			FileReader fr=new FileReader(filetoRead);
			FileWriter fw=new FileWriter(fileToWrite);
			int i=0;
			while((i=fr.read())!=-1)
			{
				fw.write((char)i);
			}
			fr.close();
			fw.close();
			System.out.println("\""+readFile+"\""+"successfully copied to"+"\""+writeFile);
			break;
		}
		else
		{
			
			System.out.println("\""+readFile+"\""+"does not exist");	
			
		}
		
		

	}

}
}
