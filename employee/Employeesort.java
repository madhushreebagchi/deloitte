package employee;

import java.util.Comparator;

public class Employeesort implements Comparator<EmployeeVo> {

	

	@Override
	public int compare(EmployeeVo ob1, EmployeeVo ob2) {
		int x= (int)ob2.getIncometax()-(int)ob1.getIncometax();
		if(x>0) {
			return 1;
		}
		else if(x==0) {
			return 0;
		}
		else if(x<0) {
			return -1;
		}
		return 0;
	}
}
