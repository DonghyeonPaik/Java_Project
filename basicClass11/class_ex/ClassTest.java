package basicClass11.class_ex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		Class pClass1 = person.getClass(); // Object 클래스의 getClass() 사용
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class; // 직접 class파일을 대입함
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("basicClass11.class_ex.Person");
		// 클래스 이름으로 가져오기
		System.out.println(pClass3.getName());
	}

}
