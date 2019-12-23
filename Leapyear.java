package demo;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int year=sc.nextInt();
		Leapyear lp=new Leapyear();
		lp.leapYear(year);
		}
public void leapYear(int year)
{
	
	if((year%4==0)&&(year%100!=0))
	{
		System.out.print(year+" is a leap year");
	}
	else if(year%400==0)
	{
		System.out.print(year+" is a leap year");
	}
	else
	{
		System.out.print(year+" is not a leap year");
	}
}
}
