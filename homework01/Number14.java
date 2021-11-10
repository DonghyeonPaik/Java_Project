package homework01;

public class Number14 {
	public static void main(String[] args) {
		int[] array = new int[10];
		System.out.printf("랜덤한 정수들: ");
		for(int i=0; i<array.length; i++) {
			array[i] = (int)(Math.random()*10+1);
			System.out.printf("%d ", array[i]);
			if(i!=0) array[0] += array[i];
		}
		System.out.printf("%n평균은 %.1f", array[0]/10.0);
	}
}