package lambda14.lambda;

@FunctionalInterface
public interface MyNumber {
	// @FunctionalInterface: 함수형 인터페이스임을 알려주는 annotation.
	// 						 추상 메소드가 하나만 선언되어야 함.
	//						 람다식에서 사용하도록.
	
	int getMax(int num1, int num2);
//	int getMax2(int num3, int num4); 추가하면 바로 오류 발생
}
