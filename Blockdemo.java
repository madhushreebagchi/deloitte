package oops;

public class Blockdemo {
	int n1=200;
	{
		System.out.println("Deloitte");
	}
static
{
	System.out.println("Static block called");
}
public Blockdemo() {
	System.out.println("Cons called");
}
	public static void main(String[] args) {
		System.out.println("Main called");
Blockdemo d1=new Blockdemo();
	}

}
