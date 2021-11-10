package operator02;

public class LogicalOperator {
	public static void main(String[] args) {
		int num1 = 10, i = 2;
		System.out.println("원래의 값");
		System.out.println("num1: "+num1);
		System.out.println("i: "+i);

		boolean b1 = ((num1=num1+10)<10) & ((i=i+2)<10);
		System.out.println("");
		System.out.println("계산 결과");
		System.out.println("b1: "+b1);
		System.out.println("num1: "+num1);
		System.out.println("i: "+i); // & 하나 연산은 결과가 나왔음에도 우측항을 계산한다!
	}
}
