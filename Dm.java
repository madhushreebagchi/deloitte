package inheritance;
import java.util.ArrayList;
import java.util.List;
public class Dm {

	public static void main(String[] args) {
		List names=new ArrayList();
		names.add("Hiyanshu");
		names.add("Anthony");
		names.add("Swami");
		names.add("Swami");
System.out.println(names);
names.add(2,"Reddy");
System.out.println(names);
names.remove("Swami");
System.out.println(names.isEmpty());
System.out.println(names.size());
	}
}
