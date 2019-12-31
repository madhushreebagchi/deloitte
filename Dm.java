package inheritance;
import java.util.*;
import java.util.List;
public class Dm {

	public static void main(String[] args) {
		Set names=new HashSet();
		names.add("Hiyanshu");
		names.add("Anthony");
		names.add("Swami");
		names.add("Swami");
System.out.println(names);
names.add("Reddy");
System.out.println(names);
names.remove("Swami");
System.out.println(names.isEmpty());
System.out.println(names.size());

	}
}
