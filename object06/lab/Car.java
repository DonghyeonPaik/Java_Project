package object06.lab;

public class Car {
	// 중복 코드 제거! 맨 아래의 Car를 호출하면서 중복된 코드를 제거함.
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){}
	Car(String model){
		this(model, "은색", 250);
	}
	Car(String model, String color){
		this(model, color, 250);
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
