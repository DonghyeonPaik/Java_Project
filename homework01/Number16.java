package homework01;

import java.util.*;

public class Number16 {
	public static void main(String[] args) {
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		Scanner sc = new Scanner(System.in);
		String inputCourse = "";
		while(true) {
			System.out.printf("과목 이름 >> ");
//			원래 여기다가 선언했었는데 while문 밖으로 빼는 것이 나을듯?
			inputCourse = sc.next();
			if(inputCourse.equals("그만")) break;
			for(int i=0; i<course.length; i++) {
				if(course[i].equals(inputCourse)) {
					System.out.println(course[i]+"의 점수는 "+score[i]);
					break;
				}
				if(i==course.length-1) System.out.println("없는 과목입니다.");
			}
		}
		sc.close();
	}
}
