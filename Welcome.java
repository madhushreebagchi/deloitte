
import finance.Salary;//import finance.*;
public class Welcome {

	public static void main(String[] args) {
		System.out.println("Welcome in Eclipse IDE");
		Salary s=new Salary();
		int r = s.calculateSalary(65000,3500);
		System.out.println(r);
	}

} 