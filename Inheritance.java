package demo;
class Order{
	int i;
	static {
		System.out.println("Order static");
	}
	Order(){
		i=10;
		System.out.println("Order cls cons"+i);
	}
	{
		System.out.println("Order cls instance block"+i);
	}
	}
class SubOrder extends Order{
	int j=9;
	static {
		System.out.println("subOrder static");
	}
	SubOrder()
	{
		j=15;
		System.out.println("subOrder cls cons"+j);
	}
	{
		System.out.println("subOrder cls instance block"+j);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		new SubOrder();

		

	}

}
