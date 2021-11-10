package interface08;

public interface PhoneInterface2 {
	// interface에는 상수, 추상메소드가 올 수 있음(Java 7까지)
	// Java 8부터 default 메소드가 올 수 있음. 단, 메소드에 default를 명시해야 함.
	// interface에 abstract 메소드가 오는 것이 당연하기 때문에 abstract는 생략됨.
	
	int timeout = 10000; // interface에서 public static final은 생략 가능
	void sendCall(); // interface에서 추상 메소드는 public abstract도 생략 가능
	void receiveCall();
	default void printLogo() { // public 생략 가능
		// interface에서 구현부가 있으면 default로 작성해야 한다!
		// 하위 클래스에서 그대로 사용하면 됨. 아니면 Override하거나.
		System.out.println("로고를 프린트합니다.");
	}
}
