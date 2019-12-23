package demo;//local and instance variable

public class Demo2 {
int i;
int num=10;
public void display()
{
	int j = 0;
	if(num==10)
	{
		j=20;
	}
	System.out.println((i+num)-j);
}
	public static void main(String[] args) {
		Demo2 d=new Demo2();
		d.display();
	}

}
