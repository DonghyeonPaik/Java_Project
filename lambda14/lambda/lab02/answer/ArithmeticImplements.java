package lambda14.lambda.lab02.answer;

public class ArithmeticImplements implements ArithmeticOperation {

	@Override
	public void ArithmeticOper(int a, int b) {
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" * "+b+" = "+(a*b));
		System.out.println(a+" / "+b+" = "+(a/b));
	}
	
}
