package object06.staticVariable;

public class StudentTest3 {
	public static void main(String[] args) {
		Student3 studentLee = new Student3();
		studentLee.studentName = "이자바";
		System.out.println(studentLee.getSerialNum());
		// serialNum이 private이므로 getter로 받아와야 한다!
		System.out.println();
		
		Student3 studentKim = new Student3();
		studentLee.setStudentName("김자바");
		System.out.println(studentKim.getSerialNum());
		System.out.println();
		
		Student3 studentHong = new Student3();
		studentLee.setStudentName("홍자바");
		System.out.println(studentHong.getSerialNum());
		System.out.println();
	}
}
