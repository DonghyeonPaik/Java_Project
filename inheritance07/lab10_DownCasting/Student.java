package inheritance07.lab10_DownCasting;

public class Student extends Person {
	String grade;
	String department;
	
	public Student(String name) {
		super(name);
	}
	@Override
	public void fly() {
		System.out.println("하늘을 나릅니다. - Student");
	}
}
