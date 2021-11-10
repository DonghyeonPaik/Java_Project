package lambda14.lambda;

public class MyNumberTest {

	public static void main(String[] args) {
		MyNumber max = (x,y) -> (x>=y)?x:y; // 람다식으로 변수 대입
		System.out.println(max.getMax(10,20)); // 인터페이스 변수로 함수 호출
		
		MyNumber2 min = (x,y) -> (x<y)?x:y;
		System.out.println(min.getMin(10,20));
		
		System.out.println();
	}
}
