package employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of employees:");
		int n = sc.nextInt();
		EmployeeBo b = new EmployeeBo();
		EmployeeVo[] emp = new EmployeeVo[n];
		for (int i = 0; i < emp.length; i++) {
			System.out.println("Enter Emp details ");
			emp[i] = new EmployeeVo(sc.nextLong(), sc.next(), sc.nextDouble(), 0);
		}
		sc.close();
		for (EmployeeVo e : emp) {
			b.calincomeTax(e);
			System.out.println(e);
		}
		
		// Sorting
		List<EmployeeVo> list = Arrays.asList(emp);
		Collections.sort(list, new Employeesort());

		System.out.println("===Sorted Array===");
		System.out.println(list);
	}

}
