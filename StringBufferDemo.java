package oops;

public class StringBufferDemo {

	public static void main(String[] args) {
		//mutable
		StringBuffer sb = new StringBuffer("Jay");
		System.out.println(sb.length());
		System.out.println(sb.capacity());//capacity is default length(16)+initial length(3)
		sb.append("MehtaMehtaMEHTAmehta");
		System.out.println(sb.length());
		System.out.println(sb.capacity());//capacity is double of append string's length if it is greater than 16

	}

}
