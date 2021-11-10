package interface08.lab01;

public class InterfaceEx {
	public static void main(String[] args) {
		// 인터페이스는 객체를 생성할 수 없어서 타입 변환으로 하거나 다른 class를 통해 생성함.
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
		
		System.out.println("==========");
		PhoneInterface ph = new SamsungPhone(); // 업캐스팅
		ph.printLogo();
		ph.sendCall(); // SamsungPhone의 메소드를 오버라이딩
		ph.receiveCall(); // SamsungPhone의 메소드를 오버라이딩
		SamsungPhone ss = (SamsungPhone) ph; // 다운캐스팅
		ss.flash();
	}
}
