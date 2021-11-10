package lambda14.lambda.lab02.answer;

import java.util.Scanner;

public class ArithmeticTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("첫번째 값을 입력하시오 >> ");
		int a = sc.nextInt();
		System.out.printf("두번째 값을 입력하시오 >> ");
		int b = sc.nextInt();
		sc.close();

		System.out.println("1. 객체 지향으로 출력하기");
		ArithmeticImplements ari1 = new ArithmeticImplements();
		try {
			ari1.ArithmeticOper(a, b);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("2. 람다식으로 출력하기");
		ArithmeticOperation ari2 = (num1, num2) -> {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		};
		try {
			ari2.ArithmeticOper(a, b);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("3. 익명 내부 클래스로 출력하기");
		ArithmeticOperation ari3 = new ArithmeticOperation() {

			@Override
			public void ArithmeticOper(int a, int b) {
				System.out.println(a + " + " + b + " = " + (a + b));
				System.out.println(a + " - " + b + " = " + (a - b));
				System.out.println(a + " * " + b + " = " + (a * b));
				System.out.println(a + " / " + b + " = " + (a / b));
			}
		};
		try {
			ari3.ArithmeticOper(a, b);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

}
