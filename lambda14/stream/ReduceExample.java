package lambda14.stream;

import java.util.ArrayList;
import java.util.Arrays;

public class ReduceExample {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		Arrays.stream(arr).forEach(s->System.out.print(s+" "));
		// Arrays.stream()에 의해 별도의 메모리 공간에 arr이 복사됨.
		// 그리고 그 공간은 forEach가 끝나면 날아감.
		System.out.printf("%n%n");
		
		int sum = Arrays.stream(arr).reduce(0, (a,b)->a+b);
		System.out.println("Stream과 lambda를 이용한 배열의 모든 요소의 합 계산: "+sum);
		System.out.println();
		
		sum = Arrays.stream(arr).sum();
		System.out.println("Stream의 sum()을 이용한 배열의 모든 요소의 합 계산: "+sum);
		System.out.println();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		sum = list.stream().mapToInt(n->n.intValue()).sum();
		System.out.println("ArrayList에다가 Stream의 mapToInt(), sum()을 이용한 합 계산");
		System.out.println("배열의 모든 요소의 합 계산: "+sum);
	}
}
