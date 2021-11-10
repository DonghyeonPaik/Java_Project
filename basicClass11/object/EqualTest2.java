package basicClass11.object;

class Student2{
	int studentID;
	String studentName;
	
	public Student2(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return studentID+", "+studentName;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student2) {
			Student2 std = (Student2)obj;
			if(studentID == std.studentID) {
				return true;
			}
			else return false;
		}
		return false;
	}
	@Override
	public int hashCode() {
		// equals()를 오버라이딩해서 객체 값을 비교하려면 hashCode()까지 오버라이딩해야 함
		return studentID;
	}
}

public class EqualTest2 {

	public static void main(String[] args) {
		Student2 Lee = new Student2(1000, "이순신");
		System.out.println(Lee);
		Student2 Lee2 = new Student2(1000, "이순신");
		System.out.println(Lee2);
		System.out.println(Lee==Lee2); // 주소 비교
		System.out.println(Lee.equals(Lee2)); // 원래는 주소 비교
		// Object 클래스의 equals() 메소드는 주소를 비교함.
		// 다른 것을 비교하려면 Override하자.
		
		System.out.println(Lee.hashCode());
		System.out.println(Lee2.hashCode());
		
		System.out.println(System.identityHashCode(Lee));
		System.out.println(System.identityHashCode(Lee2));
	}

}
