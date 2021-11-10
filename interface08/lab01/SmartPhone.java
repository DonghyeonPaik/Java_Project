package interface08.lab01;

public class SmartPhone extends PDA
implements MobilePhoneInterface, MP3Interface {

	@Override
	public void sendCall() { // PhoneInterface에서 선언한 메소드를 상속받음
		System.out.println("따르릉 따르릉");
	}

	@Override
	public void receiveCall() { // PhoneInterface에서 선언한 메소드를 상속받음
		System.out.println("전화왔어요");
	}

	@Override
	public void play() { // MP3Interface에서 선언한 메소드를 상속받음
		System.out.println("음악을 연주합니다.");
	}

	@Override
	public void stop() { // MP3Interface에서 선언한 메소드를 상속받음
		System.out.println("음악을 중단합니다.");
	}

	@Override
	public void sendSMS() { // MobilePhoneInterface에서 선언한 메소드를 상속받음
		System.out.println("문자 갑니다.");
	}

	@Override
	public void receiveSMS() { // MobilePhoneInterface에서 선언한 메소드를 상속받음
		System.out.println("문자 왔어요.");
	}
	public void schedule() { // 추가로 작성한 메소드
		System.out.println("일정 관리합니다.");
	}
	
}
