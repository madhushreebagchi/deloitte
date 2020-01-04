package Calculatorapplication;

import java.util.Scanner;

public class Calculatormain {

	public static void main(String[] args) {
		
		Object[] fs = {new Add(), new Sub(), new Mul(), new Div(), new Exit()};
		System.out.println("Enter your choice:\n1. Add\n2. Sub\n3. Multiply\n4. Divide\n5. Exit");
		int input;
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		int number1, number2;
		System.out.println("Enter two numbers: ");
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		int y = ((Arithmetic)fs[input-1]).calc(number1, number2);
		System.out.println(y);
		sc.close();

	}
}
