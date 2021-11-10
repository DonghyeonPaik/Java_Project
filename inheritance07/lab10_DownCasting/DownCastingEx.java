package inheritance07.lab10_DownCasting;

public class DownCastingEx {

	public static void main(String[] args) {
		
		Person p = new Student("홍길동"); // 업캐스팅
		
		p.id = "1000";
		System.out.println(p.id+", "+p.name);
		
		Student s = (Student) p; // 다운캐스팅
		
		s.department = "HR";
		s.grade = "4";
		s.id = "1001";
		s.name = "김유신";
		System.out.println(s.id+", "+s.name+", "+s.grade+", "+s.department);
		s.fly();
	}

}
