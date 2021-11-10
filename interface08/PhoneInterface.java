package interface08;

public interface PhoneInterface {
	// 인터페이스: 클라이언트가 회사 내부의 서버 서비스를 사용할 수 있도록 하는 것.
	// 변수는 올 수 없고, 객체 생성도 불가능하다.
	
	public static final int timeout = 10000;
	public abstract void sendCall();
	public abstract void receiveCall();
	public default void printLogo() {
		System.out.println("로고를 프린트합니다.");
	}
}
