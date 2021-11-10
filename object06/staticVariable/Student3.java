package object06.staticVariable;

public class Student3 {
	private static int serialNum = 1000; // 외부로부터의 직접 접근 차단
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student3() {
		serialNum++;
		studentID = serialNum;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public static int getSerialNum() {
		int i=10;
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}
