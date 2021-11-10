package exception10;

public class ArrayIndexOutOfBoundExceptionExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			// Run Configurations에서 arguments를 바꾸지 않는 이상 Exception에 걸림
			
			System.out.println("args[0]: "+data1);
			System.out.println("args[1]: "+data2);
			System.out.println("정상 실행");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("========== Exception 내역 ==========");
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
