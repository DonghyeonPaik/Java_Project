package object06.hide;

public class Student {
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	// getter: 변수의 값을 돌려줄 때 사용. 읽기만 함.
	public String getStudentName() {
		return studentName;
	}
	
	// setter: 변수의 값을 할당할 때 사용. 간접적으로 접근해서 저장하는 방법.
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	// getter, setter 자동으로 만들기
	// 우클릭 -> source -> generate getters and setters
}
