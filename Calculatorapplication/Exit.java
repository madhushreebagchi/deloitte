package Calculatorapplication;

public class Exit extends Arithmetic {
	@Override
	public int calc(int a, int b) {
		System.exit(0);
		return 0;
	}

}
