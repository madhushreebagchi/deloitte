package generics;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class Demomap {

	public static void main(String[] args) {
		HashMap<String, Double> hm=new HashMap<String, Double>();
		hm.put("John Doe", new Double(3434.34));
		hm.put("Tom Smith", new Double(123.22));
		hm.put("Jane Baker", new Double(1378.00));
		hm.put("Todd Hall", new Double(99.22));
		hm.put("Ralph Smith", new Double(-19.08));
		Set set=hm.entrySet();
		Iterator i=set.iterator();
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry) i.next();
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}
		System.out.println();
		double balance=((Double) hm.get("John Doe")).doubleValue();
		hm.put("John Doe", new Double(balance + 1000));
	}

}
