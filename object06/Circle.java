package object06;

public class Circle {
	// field: int radius, String name;
	int radius;
	String name;
	
	// 생성자
	public Circle() {} // 기본 생성자
	// 기본 생성자는 클래스 이름과 동일한 이름을 가진 메소드로, input 매개변수와 실행부가 없다.
	// 기본 생성자는 생략이 가능.
	// 생성자는 return을 돌려주지 않음.
	// 이름 앞에는 void(return 없는 경우) 또는 자료형(return 있는 경우)
	
	// 메소드
	public double getArea() { // 메소드 (함수): 매개변수를 받을 수 있음. return 자료형이 double임을 지정.
		return Math.PI * Math.pow(radius, 2);
	}
	
	// 메인 메소드: 실행 명령 내리는 것을 작성
	public static void main(String[] args) {
		Circle pizza = new Circle();
		// Circle: 객체형 자료형식(datatype), pizza: 참조변수
		// Circle pizza: Stack 영역에 reference 변수 pizza를 생성.
		// new Circle(): Circle class 하나의 구성요소(field, 메소드 등) 전체를 Heap에 load시킴.
		// Circle(): input과 실행부가 없는 기본 생성자
		// 그렇게 Heap에 pizza라는 instance가 생성됨.
		
		pizza.radius = 12;
		pizza.name = "JavaPizza";
		// Heap의 pizza의 field에 해당 값들을 저장함.
		
		double area = pizza.getArea();
		System.out.printf("%s's area: %.3f%n", pizza.name, area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "JavaDonut";
		area = donut.getArea();
		System.out.printf("%s's area: %.3f%n", donut.name, area);
	}
	/*
	 * Circle class 안에 radius, name field가 있고,
	 * Circle이라는 생성자가 있고,
	 * getArea()라는 메소드가 있음.
	 * 
	 */
}
