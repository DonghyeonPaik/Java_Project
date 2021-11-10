package datatype01;

import java.util.Scanner;

public class ConstantVariables {
	// 상수는 final을 앞에 붙임. 변수와의 구분을 위해서 보통 대문자로 나타냄.
	// 선언과 함께 값을 지정해야 함. 안 그러면 error 발생.
	// 여기에 선언하면 멤버 변수. 하나의 class 안에서 다 사용 가능. 상수는 보통 멤버 변수로 선언함.
	final int MAX_NUM = 100;
	static final double HELLO = Math.PI;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 여기서 선언하면 로컬 상수.
		final String NICK_NAME;
		// 로컬 상수는 사용하기 전에만 값을 지정해주면 된다.
		System.out.println("닉네임 입력: ");
		NICK_NAME = sc.nextLine();
		
		// 가독성이 좋은 코드는 변수나 상수를 의미있는 이름으로 설정하는 것.
		System.out.println("반지름 입력: ");
		final double RADIUS = sc.nextDouble();
		
		System.out.println("입력한 닉네임: "+NICK_NAME+"  원의 넓이: "+getCircleArea(RADIUS));
		
		sc.close();
	}
	public static double getCircleArea(double radius) {
		double result = HELLO * Math.pow(radius, 2);
		return result;
	}
}