package calculator_project_Main;

public class CalculatorImplement implements Calculator {

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int sub(int a, int b) {

		return a-b;
	}

	@Override
	public int multi(int a, int b) {
		return a*b;
	}

	@Override
	public int div(int a, int b) {
		if( b!=0 || a!=0 ) {

			return a/b;
		}
		return 0;
	}

	@Override
	public String displayString() {
		return "InvalidChoice";
	}
}