package object06.hide.car;

public class Car {
	// field
	private int speed;
	private boolean stop;
	
	// private field이지만 getter, setter를 통해서 외부에서 입력 및 출력이 가능하게 함.
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) { // 잘못된 수치 받았을 땐 속도를 0으로 고정
			this.speed = 0;
			return;
		}
		else this.speed = speed;
	}
	public boolean isStop() { // boolean인 경우 앞에 get 대신 is를 붙이는 게 관행
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
