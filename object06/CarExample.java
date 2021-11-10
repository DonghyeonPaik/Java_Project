package object06;

public class CarExample {
	public static void main(String[] args) {
		
		// 하나의 class로 총 4개의 객체를 만들어냄.
		
		Car car1 = new Car(); // 기본 생성자는 Car class에 담긴 값 그대로 가져옴
		System.out.println("car1.company: "+car1.company);
		System.out.println();
		
		// input 매개변수를 통해서 다른 값을 적용할 수 있음.
		Car car2 = new Car("자가용");
		System.out.println("car2.company: "+car2.company);
		System.out.println("car2.model: "+car2.model);
		System.out.println();
		
		Car car3 = new Car("자가용", "빨강");
		System.out.println("car3.company: "+car3.company);
		System.out.println("car3.model: "+car3.model);
		System.out.println("car3.color: "+car3.color);
		System.out.println();
		
		Car car4 = new Car("택시", "검정", 200);
		System.out.println("car4.company: "+car4.company);
		System.out.println("car4.model: "+car4.model);
		System.out.println("car4.color: "+car4.color);
		System.out.println("car4.maxSpeed: "+car4.maxSpeed);
		
	}
}
