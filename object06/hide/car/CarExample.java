package object06.hide.car;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		 // 잘못된 입력값 입력 시 0이 됨을 확인
		System.out.println("현재 속도: "+myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println("현재 속도: "+myCar.getSpeed());
		
		if(!myCar.isStop()) {
			myCar.setStop(true); // 차가 안 멈췄다면 멈추게 만듦
		}
		
		// 정지한 상태임을 확인
		System.out.println("현재 속도: "+myCar.getSpeed());
	}
}