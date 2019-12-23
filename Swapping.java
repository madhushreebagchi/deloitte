package demo;
import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Swapping sp=new Swapping();
		sp.Swap();
		
	}
public void Swap()
{
	int num1,num2;
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter 1st number");
	num1=sc.nextInt();
	
	System.out.print("Enter 2nd number");
	num2=sc.nextInt();
	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;
	System.out.print("1st number="+num1);
	System.out.print(" 2nd number="+num2);
}
}
