package exception10.ex;

public abstract class Calculator implements Calc {
		
	abstract int subtract(int a, int b);
	abstract double divide(int a, int b);
	
	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int times(int a, int b) {
		return a*b;
	}
}
