package controlStatement03;

import java.util.Scanner;
public class Example001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("숫자를 입력하세요: ");
		int inputNumber = sc.nextInt();
		sc.close();
		System.out.println(inputNumber%2==0?"짝수입니다":"홀수입니다");
	}
}