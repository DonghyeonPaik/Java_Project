package inheritance07.abstract_calc;

public class GoodCalc extends Calculator {
	
	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		int sum=0;
		for(int i: a) sum+=i;
		return (float)sum/a.length;
	}
	@Override
	public int times(int[] b) {
		int result=1;
		for(int i: b) result*=i;
		return result;
	}
	
	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		
		System.out.println(c.add(10, 20));
		System.out.println(c.subtract(10, 20));
		System.out.println(c.average(new int[] {5,6,7,8,9,11}));
		System.out.println(c.times(new int[] {5,6,7,8,9,11}));
	}

	
}
