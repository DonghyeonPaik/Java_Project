package homework01;

import java.util.Scanner;

public class Number13_answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		System.out.printf("금액을 입력하세요 >> ");
		int money = sc.nextInt();
		for(int i=0; i<unit.length; i++) {
			System.out.printf("%d원짜리: %d개%n", unit[i], money/unit[i]);
			money %= unit[i];
		}
	}
}
