package oops;

public class Z {
	W w = new W();
	{
		System.out.println("Instance block");
	}
	static {
		System.out.println("Static block");
	}
public Z() {
	System.out.println("Z constructor");
}
	public static void main(String st[]) {
		System.out.println("In main");
new Z();
new Z();
	}

}
