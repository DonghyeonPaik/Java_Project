package object06.lab2;

public class Car {
	String model;
	int speed;
	
	Car(String model){
		this.model = model; // this는 객체 자신을 지칭할 때 쓴다!
		// 만약 String m을 받아온다? 그러면 혼동의 여지가 없으니 this.를 빼면 됨
	}
	void setSpeed(int speed) {
		this.speed = speed; // 생성자에서는 반드시 this.가 포함되어야 함!
	}
	void run() {
		for(int i=10; i<=50; i+=10) {
			setSpeed(i); // 여기서는 this.를 생략 가능!
			System.out.println(model+"가 달립니다. (시속 "+speed+"km/h)");
		}
	}
}
