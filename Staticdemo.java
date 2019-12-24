package oops;

public class Staticdemo {
 int num1=10;
int num2=20;
 void change()
 {
	 num2++;
 }
 
	public static void main(String[] args) {
		Staticdemo d1=new Staticdemo();
		Staticdemo d2=new Staticdemo();
		d1.change();
		
		System.out.println(d1.num1);
		System.out.println(d1.num2);
		//System.out.println(num2);
		System.out.println(d2.num1);
		System.out.println(d2.num2);
	}

}
