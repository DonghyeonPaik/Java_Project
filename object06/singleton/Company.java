package object06.singleton;

public class Company {
	// singleton: 클래스에서 단 하나의 객체만 생성하도록 구현된 디자인 패턴
	private static Company instance = new Company();
	// 객체 생성을 stack 영역에 시킴.
	// singleton 객체는 private static으로 클래스 내부에서 선언, 생성됨.
	// 
	
	private Company() {} // 기본 생성자를 private로 선언!
	// 즉, 외부 클래스에서 생성자를 호출하지 못하도록 설정하는 것!
	
	public static Company getInstance() {
		// 외부에서 객체를 생성할 때, 메소드를 호출해서 객체가 생성되도록 설정
		if(instance==null) {
			instance = new Company();
		}
		return instance;
	}
}