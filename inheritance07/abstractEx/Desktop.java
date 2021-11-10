package inheritance07.abstractEx;

public class Desktop extends Computer{
	
	// 추상 메소드 오버라이딩
	@Override
	public void display() {
		System.out.println("데스크탑 모니터");
	}
	@Override
	public void typing() {
		System.out.println("데스크탑 키보드");
	}
	
	// 일반 메소드 오버라이딩
	@Override
	public void turnOn() {
		super.turnOn();
		System.out.println("데스크탑 컴퓨터입니다.");
	}
	@Override
	public void turnOff() {
		super.turnOff();
		System.out.println("데스크탑 컴퓨터 종료합니다.");
	}
	
	public void desktopOnly() {
		System.out.println("데스크탑에만 존재하는 메소드 - desktop");
	}
}
