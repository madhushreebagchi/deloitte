package demo;


public class Demo3 {

	int i=10;
//illegal forward reference	int num1=num2;
	
	int num1=200;
	int num2=1;
	public void display()
	{
		num1=111;//no need of objectsince same class
		System.out.println(i+num1+num2);
	}
		public static void main(String[] args) {
			Demo3 d=new Demo3();
			d.display();
		}

	}
class First
{
	

	public void dd() {
		Demo3 d1=new Demo3();
		d1.num1=100;
	 //error   num1 = 99;
	}
}
class Second extends Demo3
{
	public void dd() {
		Demo3 d1=new Demo3();
		d1.num1=101;
		num1=100;
	}
}

