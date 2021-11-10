package exception10;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try {
			for(int i=0; i<=5; i++) {
				arr[i] = i;
				System.out.printf("%d ", arr[i]);
				// index 5가 없으므로 ArrayIndexOutOfBoundsException이 발생함.
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}