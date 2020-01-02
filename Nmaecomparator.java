package inheritance;
import java.util.Comparator;
public class Nmaecomparator implements Comparator<Customerss>{

	@Override
	public int compare(Customerss c1,Customerss c2) {
		if((c1.getCustomerName().compareTo(c2.getCustomerName()) > 0))
		{
			return 0;
		}
		else 
		{
			return -1;
		}
	}
}
