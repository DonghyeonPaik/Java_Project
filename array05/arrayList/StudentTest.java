package array05.arrayList;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		Student studentKim = new Student(1002, "Kim");
		Student studentSong = new Student(1003, "Song");
		
		// 과목별 성적 입력
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		studentSong.addSubject("국어", 90);
		studentSong.addSubject("영어", 80);
		studentSong.addSubject("수학", 70);
		studentSong.addSubject("물리", 60);
		studentSong.addSubject("철학", 100);
		
		// 학생별 성적 확인
		studentLee.showStudentInfo();
		System.out.println("========================================");
		studentKim.showStudentInfo();
		System.out.println("========================================");
		studentSong.showStudentInfo();
	}
}
