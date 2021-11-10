package array05;

import java.util.Scanner;

public class ReturnArrayExample {
	static int[] makeArray(int input) {
		int[] temp = new int[input];
		for(int i=0; i<temp.length; i++) temp[i] = i+1;
		return temp;
	}
	
	public static void main(String[] args) {
		int input = 0;
		System.out.printf("1부터 1씩 증가하는 배열을 만듭니다. 원하는 칸 수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		sc.close();
		System.out.println("만들어진 배열은 아래와 같습니다.");
		System.out.println("---------------------------");
		for(int i: makeArray(input)) System.out.printf("%d ", i);
	}
}