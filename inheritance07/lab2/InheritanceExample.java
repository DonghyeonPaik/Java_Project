package inheritance07.lab2;

public class InheritanceExample {
	public static void main(String[] args) {
		Student s  =new Student();
		s.set(); // 자식 클래스의 메소드를 호출해서 부모 클래스에 값들을 저장함.
		
		System.out.println(s.age);
		System.out.println(s.name);
		System.out.println(s.height);
		System.out.println(s.getWeight());
	}
}
