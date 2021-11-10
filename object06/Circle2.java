package object06;

public class Circle2 {
	// 생성자가 2개인 circle class. 매개변수에 따라서 구별해서 호출할 수 있음.
	// 생성자는 객체를 초기화하는 역할을 한다. (초기화: 멤버 변수에 기본값을 할당하는 것)
	int radius;
	String name;
	
	public Circle2() {
		radius = 1;
		name = "";
	}
	public Circle2(int r, String n) {
		radius = r;
		name = n;
	}
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public static void main(String[] args) {
		// main 메소드 안에서 작성되는 것들은 stack 영역에 저장됨.
		// Circle class의 멤버 변수들은 new라는 키워드를 사용해서 객체를 만들어야지만 사용가능.
		
		Circle2 pizza = new Circle2(10, "JavaPizza");
		double area = pizza.getArea();
		System.out.printf("%s's area: %.3f%n", pizza.name, area);
		
		Circle2 donut = new Circle2();
		donut.name = "JavaDonut";
		area = donut.getArea();
		System.out.printf("%s's area: %.3f%n", donut.name, area);
	}
}
