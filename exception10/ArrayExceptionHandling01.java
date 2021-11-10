package exception10;

public class ArrayExceptionHandling01 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try { // Exception이 발생할 수 있는 영역 지정
			for(int i=0; i<=arr.length; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			// Exception이 있는 경우 실행할 부분 [어떤 Exception인지를 지정 가능]
			System.out.print("예외 처리: ");
			System.out.println(e);
		}
		System.out.println("프로그램 정상 종료");
	}
}