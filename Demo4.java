package demo;

public class Demo4 {
int num1=100;
int num2=200;
public Demo4() {
	num1++;
	num2=--num1;
}
public Demo4(int num2,Demo4 demo) {
	num2=this.num1++;
	this.num1=demo.num2++;
	this.num2=--  num2;
	demo.num1=++num2;
}
	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		Demo4 d1=new Demo4();
		Demo4 d2=new Demo4(num2,d1);
		
		System.out.println(d1.num1+d2.num2+num1); 
		System.out.println(d1.num1+d2.num2+num2); 
	}

}
