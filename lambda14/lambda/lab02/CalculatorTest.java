package lambda14.lambda.lab02;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("첫번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		System.out.printf("두번째 정수 입력 >> ");
		int num2 = sc.nextInt();
		sc.close();
		System.out.println();
		
		System.out.println("1. 객체지향으로 출력");
		CalculatorImplements calc = new CalculatorImplements();
		calc.calculate(num1, num2);
		
		System.out.printf("%n2. 람다식을 이용%n");
		Calculator cal = (a,b)->{
			System.out.println(a+" + "+b+" = "+(a+b));
			System.out.println(a+" - "+b+" = "+(a-b));
			System.out.println(a+" * "+b+" = "+(a*b));
			try {
				System.out.println(a+" / "+b+" = "+(a/b));
			}catch(ArithmeticException e) {
				System.out.println(e);
			}
			
		};
		cal.calculate(num1, num2);
		
		System.out.printf("%n3. 익명 내부 클래스 사용%n");
		Calculator cal3 = new Calculator() {
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
		};
		cal3.calculate(num1, num2);
	}
}
