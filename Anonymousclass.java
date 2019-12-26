package inheritance;
interface ChangePasswored{
	void doChange();
}

public class Anonymousclass {

	public static void main(String[] args) {
		ChangePasswored c=new ChangePasswored()
				{
			@Override
			public void doChange()
			{
				System.out.println("Password changed");
			}
				};
				c.doChange();

	}

}
