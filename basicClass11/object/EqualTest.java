package basicClass11.object;

class Student{
	int studentID;
	String studentName;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return studentID+", "+studentName;
	}
}

public class EqualTest {
	public static void main(String[] args) {
		// String, Integer, Boolean 등은 toString()과 equals()가 재정의되어 있음
		// 
		
		Student studentLee = new Student(100, "이순신");
		System.out.println(studentLee.toString());
		Student studentLee2 = studentLee;
		Student studentLee3 = new Student(100, "이순신");
		
		if(studentLee == studentLee2) {
			System.out.println("두 주소는 같습니다.");
		}else {
			System.out.println("두 주소는 다릅니다.");
		}
		if(studentLee.equals(studentLee2)) {
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		}else {
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
		}
		
		if(studentLee == studentLee3) {
			System.out.println("두 주소는 같습니다.");
		}else {
			System.out.println("두 주소는 다릅니다.");
		}
		if(studentLee.equals(studentLee3)) {
			System.out.println("studentLee와 studentLee3는 동일합니다.");
		}else {
			System.out.println("studentLee와 studentLee3는 동일하지 않습니다.");
		}
	}
}
