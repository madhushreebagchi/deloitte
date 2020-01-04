package employee;

public class EmployeeBo {

	public void calincomeTax(EmployeeVo e) {
		
		double annualincome=e.getAnnualincome();
		if(annualincome<250000) {
			e.setIncometax(0);
		}
		else if(annualincome<500000)
		{
			e.setIncometax(0.1*annualincome);
		}
		else if(annualincome<1000000)
		{
			e.setIncometax(0.2*annualincome);
		}
		else {
			e.setIncometax(0.3*annualincome);
		}
		
		
	}
}
