package inheritance;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Customermain {

	public static void main(String[] args) {
		List<Customerss> allCustomers=new ArrayList<Customerss>();
		Customerss customer1=new Customerss(101,"Jay","Pune",99000);
		allCustomers.add(customer1);
		allCustomers.add(new Customerss(102,"Ray","Delhi",89000));
		allCustomers.add(new Customerss(103,"Say","Mumbai",79000));
		allCustomers.add(new Customerss(104,"May","Ranchi",69000));
		allCustomers.add(new Customerss(105,"Tay","Kolkata",59000));
		
		Iterator<Customerss> customerIterator=allCustomers.iterator();
		while(customerIterator.hasNext()) {
			Customerss custo=customerIterator.next();
			System.out.println(custo);
		}
		Collections.sort(allCustomers);
	
	System.out.println("After sorting on billamount");
	Iterator<Customerss> customerIterator1=allCustomers.iterator();
	
	while(customerIterator1.hasNext()) {
		System.out.println(customerIterator1.next());
	}
	System.out.println("Sort on 1)Name 2)Address 3)Billamount ???");
	Scanner sc= new Scanner(System.in);
	int choice=sc.nextInt();
	
	//sorting
	if(choice==3) {
		Collections.sort(allCustomers);
		System.out.println("After sorting on bill amount");
		System.out.println(allCustomers);
	}
	
	if(choice==1) {
		Collections.sort(allCustomers,new Nmaecomparator());
		System.out.println("After sorting on name");
		System.out.println(allCustomers);
	}
	
	if(choice==2) {
		Collections.sort(allCustomers);
		System.out.println("After sorting on address");
		System.out.println(allCustomers);
	}
}
}
