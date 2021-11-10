package object06;

public class Person {
	final String nation = "Korea"; // final이 붙으면 값을 변경할 수 없음.
	final String ssn; // 주민번호 저장 시 수정 못하도록 필드를 설정.
	String name;
	/*
	 * 변수 앞에 final이 붙으면 상수가 됨. 값 변경이 안 됨.
	 * 클래스 앞에 final이 붙으면 자식 객체를 만들 수 없음.
	 * 메소드 앞에 final이 붙으면 메소드 오버라이딩이 안됨.
	 * * 메소드 오버라이딩: 부모 클래스에서 선언된 메소드를 자식 클래스에서 재정의해서 사용
	 * * 메소드 오버로딩: 동일한 메소드 이름으로 매개변수를 다르게 해서 메소드를 실행
	 */
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}