package datatype01;

public class IntegerType01 {

	public static void main(String[] args) {
		int kor = 89;
		int eng = 99;
		int math = 78;
		int sum = kor + eng + math;
		System.out.println("국어 성적: "+kor);
		System.out.println("영어 성적: "+eng);
		System.out.println("수학 성적: "+math);
		System.out.println("성적 합계: "+sum);
		
		// 정수형 저장 숫자를 넘어가는 경우
		int integer01 = 2100000000;
		int integer02 = integer01;
		int intSum = integer01+integer02;
		System.out.println("21억을 서로 더하면: "+intSum);
		// 범위를 벗어나서 부호 비트가 1이 되기 때문에 음수 값으로 출력됨.
	}
}
