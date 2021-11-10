package basicClass11.class_ex;

public class NewInstanceTest {
	public static void main(String[] args) throws 
			ClassNotFoundException,
			InstantiationException,
			IllegalAccessException {
		Person person1 = new Person();
		System.out.println(person1);
		Class pClass = Class.forName("basicClass11.class-ex.Person");
		
		// newInstance(): *.class 파일로 객체 생성
		Person person2 = (Person) pClass.newInstance();
		System.out.println(person2);
	}
}
