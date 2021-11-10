package array05;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.printf("입력할 정수의 개수를 입력하세요: ");
		int size = sc.nextInt();
		int[] intArray = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.printf("정수를 하나씩 입력해주세요[남은 갯수: %d]: ", size-i);
			intArray[i] = sc.nextInt();
		}
		sc.close();
		System.out.printf("입력한 정수는 다음과 같습니다: ");
		for(int i: intArray) {
			System.out.printf("%d ", i);
			sum += i;
		}
		System.out.printf("%n평균은 %.1f입니다.%n", sum/(float)size);
	}
}