package array05;

import java.util.*;

public class ArrayAccess {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[5];
		int max = 0;
		System.out.printf("양의 정수 5개를 입력하세요 >> ");
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = sc.nextInt();
			if(intArray[i] > max) {
				max = intArray[i];
			}
		}
		sc.close();
		System.out.printf("입력한 정수 중 최댓값은 %d입니다.%n", max);		
	}
}