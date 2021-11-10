package arrayType04;

import java.lang.reflect.Array;

public class ArrayType {
	public static void main(String[] args) {
		
		// int array 선언 방법 1
		int[] intArray = {10,20,30,40,50};
		for(int i=0;i<5;i++) {
			System.out.printf("intArray [%d]: %-5d%n", i, intArray[i]);
		}
		// int array 선언 방법 2
		int[] intArray2;
		intArray2 = new int[] {10,20,30,40,50};
		System.out.println();
		
		// String array
		String strArray[] = new String[] {"이순신", "강감찬", "권율"};
		for(int i=0;i<strArray.length;i++){
			System.out.printf("strArray [%d]: %-5s%n", i, strArray[i]);
		}
		System.out.println();
		
		// 2d array 선언
		int[][] int2dArray = {{10,20,30,40,50},{60,70,80,90,100}};
		for(int i=0;i<int2dArray.length;i++) {
			for(int j=0;j<int2dArray[i].length;j++) System.out.printf(
					"int2dArray [%d][%d]: %-5d%n", i, j, int2dArray[i][j]);
		}
		
		// 더 깔끔하게 출력하려면
		for(int[] i:int2dArray) {
			for(int j:i) System.out.printf("int2dArray [%d][%d]: %d%n", j);
		}
	}
}