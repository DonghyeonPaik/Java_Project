package inheritance07.lab10_DownCasting;

public class UpcastingEx {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("홍길동");
		
		p=s;
		// Person p = new Student("홍길동");와 같은 역할.
		
		System.out.println(p.name);
		
		p.fly(); // 동적 바인딩에 의해 자식 클래스의 fly() 결과가 나옴
		s.fly();
		
//		p.grade = "A";
		
//		p.department = "Com";
	}

}
