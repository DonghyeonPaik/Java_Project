package array05.arrayList;

import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList; // ArrayList 선언.
	// ArrayList는 객체를 담는 배열. 추가가 가능함.
	// ArrayList<Subject> subjectLis = new ArrayList<Subject>();
	// 이처럼 작성하면 선언과 동시에 객체 배열을 생성하게 됨.
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>(); // subjectList 배열 변수 생성
	}
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject); // 객체 subject를 배열변수 subjectList에 추가
	}
	public void showStudentInfo() {
		int total=0;
		int numOfSubject=0;
		for(Subject s: subjectList) {
			total+=s.getScorePoint();
			numOfSubject++;
			System.out.println("학생 "+studentName+"의 "+
					s.getName()+" 성적은 "+s.getScorePoint()+"입니다.");
		}
		System.out.println("----------");
		System.out.println("학생 "+studentName+"의 총점은 "+total+
				"이고, 평균점수는 "+total/numOfSubject+"입니다.");
	}
}
