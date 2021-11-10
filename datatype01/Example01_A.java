package datatype01;

import java.lang.reflect.Array;

public class Example01_A {

	public static void main(String[] args) {
		final int[] HONG = {95, 70, 90};
		final int[] KIM = {90, 85, 80};
		final int[] PARK = {85, 98, 97};
		
		System.out.println("=====================================");
		System.out.printf("%-6s%-6s%-6s%-6s%-7s%-6s%n", "name", "kor", "eng", "math", "total", "avg");
		System.out.println("=====================================");
		scorePrinter("HONG", HONG);
		scorePrinter("KIM", KIM);
		scorePrinter("PARK", PARK);
	}
	public static void scorePrinter(String str, int[] arr) {
		int sum = 0, i = 0;
		final int j = Array.getLength(arr);
		while(i < j) {
			sum += arr[i];
			i++;
		}
		System.out.printf("%-6s%-6s%-6s%-6s%-7s%-6.2f%n",
				str, arr[0], arr[1], arr[2], sum, sum/3.0);
	}
}