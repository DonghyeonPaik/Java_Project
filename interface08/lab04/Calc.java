package interface08.lab04;

public interface Calc {
	double PI = 3.14;
	int ERROR = -9999999;
	
	int add(int num1, int num2);
	int subtract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// interface에서 구현 코드가 있는 메소드들.
	default void description() { // Java 8.0부터 지원
		System.out.println("정수 계산기를 구현합니다.");
	}
	static int total(int[] arr) { // 처음부터 가능함
		int total = 0;
		for(int i: arr) total+=i;
		return total;
	}
	/*
	 *  // interface에서의 private method는 Java 9.0부터 지원
	private void myMethod() {
		System.out.println("Private Method");
	}
	private static void myStaticMethod(){
		System.out.println("Private Static Method");
	}
	*/
}
