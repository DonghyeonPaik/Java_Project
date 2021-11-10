package inheritance07.lab10_DownCasting;

public class DownCastingEx02 {
	public static void main(String[] args) {
		// 객체 변수 선언
		Student s;
		Person p;
		
		s = new Student("홍길동"); // 객체 생성
		System.out.println("=====업캐스팅======");
		p = s; // 업캐스팅: 강제 데이터 생략 가능. 원래는 p = (Person) s;
		p.id = "2000";
		p.name = "김자바";
		p.fly();
		
		System.out.println("=====다운캐스팅=====");
		s = (Student) p; // 다운캐스팅: 데이터 타입을 명시해야 함.
		s.id = "3000";
		s.name="홍자바";
		s.grade = "4";
		s.department = "sales";
		s.fly();
		
	}
}
