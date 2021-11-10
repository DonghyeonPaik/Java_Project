package operator02;

public class BinaryOperator {
	public static void main(String[] args){
		
		// 연산자의 우선순위
		// ++, --, ~, !, 부호 > 곱셈, 나눗셈 > 덧셈, 뺄셈 > 시프트 > 비교 > 논리
		
		short s = 100;
		short s2 = -100; // short형은 -s가 안 통한다! integer로는 가능
		int num1 = -s;
		System.out.println(num1);
		s2 = ++s2;
		System.out.println(s2);
		int result = 3*2+5%2-7/3*5;//(3*2)+(5%2)-((7/3)*5) = 7 - 10 = -3 
		System.out.println(result);
		
		// local variable은 웬만하면 선언할 때 값을 초기화하자...
		
	}
}
