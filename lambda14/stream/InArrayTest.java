package lambda14.stream;

import java.util.Arrays;

public class InArrayTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		/* Stream을 이용한 계산 */
		long startTime = System.nanoTime(); // 시간 측정 시작
		
		int sumVal = Arrays.stream(arr).sum(); // 배열의 모든 값을 더함
		int count = (int)Arrays.stream(arr).count(); // 배열 칸 수를 셈
		double avgVal = Arrays.stream(arr).average().getAsDouble();
		int minVal = Arrays.stream(arr).min().getAsInt();
		int maxVal = Arrays.stream(arr).max().getAsInt();
		
		long estimatedTime = System.nanoTime() - startTime; // 시간 측정 끝
		
		System.out.println("===== Stream 이용 =====");
		System.out.println("배열의 모든 요소의 합: "+sumVal);
		System.out.println("배열의 모든 요소의 수: "+count);
		System.out.println("배열의 모든 요소의 평균: "+avgVal);
		System.out.println("배열의 모든 요소의 최솟값: "+minVal);
		System.out.println("배열의 모든 요소의 최댓값: "+maxVal);
		
		System.out.println("소요 시간: "+
					(double)estimatedTime/1000000000.0+"sec");
		System.out.println();
		
		/* Enhanced-For문을 이용한 계산 */
		long startTime2 = System.nanoTime(); // 시간 측정 시작
		
		int sumVal2 = 0;
		int count2 = arr.length;
		double avgVal2 = 0;
		int minVal2 = Integer.MAX_VALUE;
		int maxVal2 = Integer.MIN_VALUE;
		for(int i: arr) {
			sumVal2+=i;
			minVal2=minVal2<i?minVal2:i;
			maxVal2=maxVal2>i?maxVal2:i;
		}
		avgVal2 = sumVal2/(double)count2;
		
		long estimatedTime2 = System.nanoTime() - startTime2; // 시간 측정 끝
		
		System.out.println("===== Enhanced-For 이용 =====");
		System.out.println("배열의 모든 요소의 합: "+sumVal2);
		System.out.println("배열의 모든 요소의 수: "+count2);
		System.out.println("배열의 모든 요소의 평균: "+avgVal2);
		System.out.println("배열의 모든 요소의 최솟값: "+minVal2);
		System.out.println("배열의 모든 요소의 최댓값: "+maxVal2);
		System.out.println("소요 시간: "+
				(double)estimatedTime2+"nanosec");
		System.out.println();
		
		/* 소요시간 비교 */
		System.out.println("소요 시간 차이: "+
				(double)(estimatedTime-estimatedTime2)/1000000000.0+"sec");
		System.out.println("이 상황에서 Stream은 Enhanced-For문보다 약 "+
				(estimatedTime-estimatedTime2)/estimatedTime2+"배 더 소요됨");
	}

}
