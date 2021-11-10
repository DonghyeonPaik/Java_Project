package operator02;

public class AssignmentOperator {
	
	public static void main(String[] args) {
		int num1 = 100;
		System.out.printf("num1 초기값: %d%n", num1);
		num1 *= 100 + 2;
		System.out.printf("num1 *= 100 + 2 연산 결과: %d%n", num1);
		System.out.printf("++num1 연산 결과: %d%n", ++num1);
		System.out.printf("num1++ 연산 결과: %d%n", num1++);
		// num1++은 ++이 출력 이후에 계산되어 계산 전의 값이 출력됨
	}
}
