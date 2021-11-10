package basicClass11.object.Exercise;

class Student3 {
	int studentID;
	String studentName;
	int grade;
	
	public Student3(int studentID, String studentName, int grade) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return studentName+", "+grade;
	}
	
	@Override
	public boolean equals(Object obj) { // 업캐스팅
		
		if(obj instanceof Student3) {
			Student3 std = (Student3) obj; // 다운캐스팅
			if(studentName==std.studentName) {
				return true;
			}
			else return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentID;
	}
	
	public static void main(String[] args) {
		Student3 Lee = new Student3(1000, "이순신", 5);
		System.out.println(Lee);
		Student3 Lee2 = new Student3(1000, "이순신", 5);
		System.out.println(Lee2);
		System.out.println(Lee==Lee2); // 주소 비교
		System.out.println(Lee.equals(Lee2));
		// studentName이 같은지를 비교
		
		System.out.println(Lee.hashCode());
		System.out.println(Lee2.hashCode());
		
		System.out.println(System.identityHashCode(Lee));
		System.out.println(System.identityHashCode(Lee2));
	}
}
