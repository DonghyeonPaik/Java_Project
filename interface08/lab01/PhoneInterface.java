package interface08.lab01;

public interface PhoneInterface {
	int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("로고를 프린트합니다.");
	}
}
