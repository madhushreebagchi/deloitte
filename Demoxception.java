package inheritance;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Demoxception {
	int num1,num2;
	int result;
	
	Scanner sc=new Scanner(System.in);
	String name=sc.next();
	
	public void display() {
		System.out.println("Welcome in display");
		try {
			System.out.println(name.length());
			System.out.println("Enter 1st no.:");
			num1=sc.nextInt();
			System.out.println("Enter 2nd no.:");
			num2=sc.nextInt();
			result=num1/num2;
			System.out.println(result);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Dont be smart... why have you entered aphabet? ");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dont be over smart.... Why have you entered 0 in second no.?");
		}
		catch(NullPointerException e)
		{
			System.out.println("You cant access null objects");
		}
		catch(Exception e)
		{
			System.out.println("Some other exception");
		}
	
		finally//no matter what finally block will get called
		{
			System.out.println("FINALLY CALLED");
		}
		System.out.println("bye");
	}
	
	public static void main(String[] args) {
		System.out.println("MAIN STARTED");
		Demoxception d=new Demoxception();
		d.display();
		System.out.println("MAIN ENDED");
		}

	}


