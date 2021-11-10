package basicClass11.wrapper;

public class BoxingUnboxing {
	// AutoBoxing: 기본 자료형의 데이터를 객체형 변수에 할당할 때 자동으로 일어남
	// UnBoxing: 객체형 자료형을 기본 자료형으로 사용할 때 자동으로 일어남
	// 둘 다 JAVA 5.0부터 지원
	
	public static void main(String[] args) {
		Integer num1 = new Integer(100);
		int num2 = 200;
		int sum = num1+num2; // num1 자동으로 언박싱
		int sum2 = num1.intValue()+num2; // JAVA 5.0 이전에는 이런식으로 씀
		Integer num3 = num2; // 오토박싱: Integer.valueOf(num2)으로 자동 변환
		
		System.out.println("sum: "+sum);
		System.out.println("sum2: "+sum2);
	}

}
