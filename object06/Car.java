package object06;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// return 값이 없는 생성자는 return 형식을 정하지 않아도 됨!
	Car(){
		
	}
	Car(String model){
		// input 매개변수, 할당 변수이름, 메모리의 변수이름이 model로 모두 같은 상황.
		// this.model: 객체의 model field를 가리킴. 객체가 객체 자신(의 요소)을 지칭하는 표현임.
		this.model = model;
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
