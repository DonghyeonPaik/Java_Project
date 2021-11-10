package interface08.lab01;

public class InterfaceEx01 {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo(); // PhoneInterface에서 선언된 메소드
		phone.sendCall(); // 오버라이딩
		phone.play(); // 오버라이딩
		
		System.out.println("3과 5를 더하면 "+phone.calculate(3, 5));
		phone.schedule();
	}
}
