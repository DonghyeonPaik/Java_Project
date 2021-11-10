package datatype01;


public class RealNumberType01 {

	public static void main(String[] args) {
		float float01 = 200;
		double double01 = 1;
		System.out.println(float01);
		System.out.printf("\n");
		
		long ln = 100;
		// long과 float 자료형의 합산 결과는 float에 담김.
		float sumOfLongAndFloat = ln + float01;
		System.out.println(sumOfLongAndFloat);
		System.out.printf("\n");
		
		// 실수형의 기본 데이터 타입은 double임. 소수점이 붙으면 무조건 double형에 담아야 함.
		double comma1 = 3.14;
		// 단, 소수점이 안 붙는 값은 float에 저장 가능.
		// float형에 굳이 소수점이 붙은 값을 담고 싶다면 casting하거나 f(또는 F)를 붙여야 함.
		float comma2 = (float)3.14;
		float comma3 = 3.14f;
		float comma4 = 3.14F;
		System.out.println(comma1);
		System.out.println(comma2);
		System.out.println(comma3);
		System.out.println(comma4);
		System.out.printf("\n");
		
		comma3 = 300;
		comma4 = 400;
		float sumOfFloat = comma3 + comma4;
		System.out.println("300 + 400 = "+sumOfFloat);
		System.out.printf("\n");
		
		// float + double 자료형 연산은 double형에 담긴다.
		double01 = 10.0;
		double sumOfFloatAndDouble = comma3 + double01;
		System.out.println("300 + 10.0 = "+sumOfFloatAndDouble);
		System.out.printf("\n");
		
		// Math 라이브러리 참조하는 경우
		double radius = 10;
		double result = Math.PI * Math.pow(radius, 2);
		System.out.printf("%.1f\n\n", result);
		
		int rad1 = 10;
		double pi = 3.14;
		double answer = pi * rad1 * rad1;
		int result1 = (int)answer;
		float result2 = (float)answer;
		System.out.println("int형: "+result1);
		System.out.println("float형: "+result2);
		System.out.println("double형: "+answer);
	}
}