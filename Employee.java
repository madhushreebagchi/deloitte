package oops;
import java.util.Scanner;
public class Employee {

	public int employeeId;
	public String employeeName;
	public String employeeAddress;
	public int salary;
	Scanner sc=new Scanner (System.in);
	
	public void takeSalary()
	{
		
		System.out.print("Enter employee id:");
		employeeId = sc.nextInt();
		System.out.print("Enter employee name:");

		employeeName = sc.next();
		
		System.out.print("Enter employee address:");
		employeeAddress = sc.next();
		System.out.print("Enter employee salary:");
		salary = sc.nextInt();
	}
	public void printEmployeeDetails()
	{
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Employee Address : "+employeeAddress);
		System.out.println("Employee salary : "+salary);
	}
}
