package generics;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
public class Linkedhashset {

	public static void main(String[] args) {
		Set<String> names=new LinkedHashSet();
		names.add("Jay");
		names.add("Veeru");
		names.add("Neha");
		names.add("Spring");

//names.remove("Neha");
System.out.println(names);
Iterator<String> i=names.iterator();

while(i.hasNext()) {
	String str=i.next();
	if(str.equals("Neha"))
		continue;
	System.out.println(str);
}

	}
}