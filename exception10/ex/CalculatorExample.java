package exception10.ex;

import java.util.Scanner;

public class CalculatorExample {
	public static void main(String[] args) throws InterruptedException {
		
		CompleteCalc calc = new CompleteCalc();
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("a 입력: ");
		int a = sc.nextInt();
		System.out.printf("b 입력: ");
		int b = sc.nextInt();
		sc.close();
		
		// 이렇게 하지 않고 toString()을 Override해서 한번에 출력할 수도 있음!
		System.out.printf("%d + %d = %d%n", a, b, calc.add(a,b));
		System.out.printf("%d - %d = %d%n", a, b, calc.subtract(a,b));
		System.out.printf("%d * %d = %d%n", a, b, calc.times(a,b));
		System.out.printf("%d / %d = %f%n", a, b, calc.divide(a,b));
		
		System.out.println("정상 가동");
		Thread.sleep(10);
		System.out.println("프로그램 종료");
	}
}
