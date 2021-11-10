package object06.hide;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		
		
		// private이기 때문에 studentLee.studentName = ~ 이렇게 작성하면 오류 난다!
		studentLee.setStudentName("Lee"); // setter를 통해서 private 변수에 값 저장
		System.out.println("학생 이름: "+studentLee.getStudentName());
		
		// 자동으로 getter, setter 만들기
		
	}
}
