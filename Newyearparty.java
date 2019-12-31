package inheritance;
import java.util.Scanner;
class InvalidAgeException extends RuntimeException
{
	public InvalidAgeException() {
	}
	public InvalidAgeException(String message) {
		super(message);
	}
}
class Newyear
{
	int eligibleAge=16;
	Scanner sc=new Scanner(System.in);
	int age;
	public void enterClub() {
		System.out.println("pLease enter your age");
		age=sc.nextInt();
		if(age<eligibleAge) {
			throw new InvalidAgeException("Under age");	
		}
	}
}
public class Newyearparty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
