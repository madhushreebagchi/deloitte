package demo;

public class Demo1 {
int num=100;
float marks=90.98f;//explicit casting
byte grade=120;//explicit casting
String String = "Mohan";//works
final int DELOITTE_FINAL_MARKS=100;
public void display() {
	//System.out.println("Your name is="+String);
	//System.out.println("sum is="+(num + marks+grade));
	//System.out.println("sum is="+(num + marks));
	System.out.println("sum is="+num + 10);
	System.out.println(num + 10);
	
	
}
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.display();

	}

}
