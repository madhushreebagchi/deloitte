package inheritance;
class ChangePassword{
	String pw="pass";
	class EncryptPassword{
		int pwl=5;
		public void doEncrypt() {
			System.out.println("password="+pw);
	
		}
	}
}

public class DemoInnerclass {

	public static void main(String[] args) {
		ChangePassword pa=new ChangePassword();
		ChangePassword.EncryptPassword e=pa.new EncryptPassword();
		
e.doEncrypt();
	}

}
