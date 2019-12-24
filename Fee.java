package oops;

public class Fee {
	void print(int...n)
	{
		for(int i:n)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Fee f1=new Fee();
		f1.print(12,2,2,2,2,2,2);

	}

}
