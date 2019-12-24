package oops;

public class Calculator {
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(double a,double b)
	{
		System.out.println(a+b);
	}
	public void add(int a,double b)
	{
		System.out.println(a+b);
	}
	public void add(double a,int b)
	{
		System.out.println(a+b);
	}
	public void diff(int a,int b)
	{
		System.out.println(a-b);
	}
	public void diff(double a,double b)
	{
		System.out.println(a-b);
	}
	public void diff(int a,double b)
	{
		System.out.println(a-b);	
	}
	public void diff(double a,int b)
	{
		System.out.println(a-b);
	}
	public void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	public void mul(double a,double b)
	{
		System.out.println(a*b);
	}
	public void mul(int a,double b)
	{
		System.out.println(a*b);
	}
	public void mul(double a,int b)
	{
		System.out.println(a*b);
	}
	public void div(int a,int b)
	{
		System.out.println(a/b);
	}
	public void div(double a,double b)
	{
		System.out.println(a/b);
	}
	public void div(int a,double b)
	{
		System.out.println(a/b);
	}
	public void div(double a,int b)
	{
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add(90, 45);
		c.diff(90, 45);
		c.mul(90, 45);
		c.div(90, 45);
		c.add(90.00, 45.00);
		c.diff(90.00, 45.00);
		c.mul(90.00, 45.00);
		c.div(90.00, 45.00);
		c.add(90, 45.00);
		c.diff(90, 45.00);
		c.mul(90, 45.00);
		c.div(90, 45.00);
		c.add(90.00, 45);
		c.diff(90.00, 45);
		c.mul(90.00, 45);
		c.div(90.00, 45);
	}

}
