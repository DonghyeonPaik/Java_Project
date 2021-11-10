package object06.staticVariable;

public class StudentTest1 {
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("강자바");
		System.out.println(studentLee.serialNum);
		// static이라서 바로 호출 가능
		Student studentKim = new Student();
		studentKim.setStudentName("김자바");
		System.out.println(studentKim.serialNum);
		studentKim.serialNum++;
		// static이라서 다른 객체에도 반영됨. 결국 같은 변수이기 때문.
		
		
		
		System.out.println();
		
		System.out.println(Student.serialNum);
		// 객체 생성 없이 바로 호출 가능
		
		System.out.println();
		
		System.out.println(Student.getSerialNum());
	}
}
