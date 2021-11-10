package lambda14.lambda.lab02;

public class CalculatorImplements implements Calculator{
	@Override
	public void calculate(int a, int b) {
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" * "+b+" = "+(a*b));
		try {
			System.out.println(a+" / "+b+" = "+(a/b));
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
}
