package ex.chap05;

import java.util.*;

public class Question09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		ArrayList<Student> scores = new ArrayList<Student>();
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println(
					"--------------------------------------------------");
			System.out.println(
					"1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println(
					"--------------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo==1) {
				Student s = new Student();
				System.out.print("학생수 > ");
				studentNum = scanner.nextInt();
			}else if(selectNo==2) {
				for(int i=0; i<studentNum; i++) {
					Student s = new Student();
					System.out.println("학생들의 점수를 입력해주세요 > ");
					s.score = scanner.nextInt();
					scores.add(s);
				}
			}else if(selectNo==3) {
				for(Student s: scores) {
					System.out.println(s.getScore());
				}
			}else if(selectNo==4) {
				int max=0, sum=0;
				for(Student s: scores) {
					int i = s.getScore();
					max=(max>i)?max:i;
					sum+=i;
				}
				System.out.printf("최고 점수: %d%n", max);
				System.out.printf("평균 점수: %.1f%n", sum/(float)studentNum);
			}else if(selectNo==5) {
				run = false;
			}else System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
		}
		scanner.close();
		System.out.println("프로그램 종료");
	}
}