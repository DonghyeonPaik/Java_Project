package interface08.lab05_p372;

public class Taxi implements Vehicle {
	// Vehicle 인터페이스를 구현하는 클래스
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}