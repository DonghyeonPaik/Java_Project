package homework01;

import java.util.*;

public class Number12 {
	public static void main(String[] args) {
		int[] array = new int[10];
		System.out.printf("양의 정수를 입력하시오 >> ");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<10; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0; i<10; i++) {
			if(array[i]%3==0) System.out.printf("%d ", array[i]);
		}
	}
}
