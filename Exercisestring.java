package fox;
import java.util.StringTokenizer;
public class Exercisestring {

	public static void main(String[] args) {
		
		String s1="The quick brown fox jumps over the lazy dog";
		StringTokenizer tokenizer = new StringTokenizer(s1);
		System.out.println(tokenizer.countTokens());
		while(tokenizer.hasMoreTokens())
		{
			System.out.println(tokenizer.nextElement());
		}
		while(tokenizer.hasMoreTokens())
		{
			if(tokenizer.nextElement().equals("fox"))
			{
				System.out.println();
			}
			else {
				System.out.println(tokenizer.nextElement());
			}
				
		}
		System.out.println("The character at the 12th index is "+s1.charAt(12));
		System.out.println(s1.contains("is"));
		System.out.println(s1.concat(" and killed it"));
		System.out.println(s1.endsWith("dogs"));
		System.out.println(s1.equals("The quick brown Fox jumps over the lazy Dog"));
		System.out.println(s1.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
		System.out.println(s1.length());
		System.out.println(s1.matches("The quick brown Fox jumps over the lazy Dog"));
		System.out.println(s1.replace("The","A"));
		System.out.println(s1.substring(0,25));
		System.out.println(s1.substring(26,43));
		System.out.println(s1.substring(16,19));
		System.out.println(s1.substring(40,43));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('e'));
	}

}
