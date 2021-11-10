package generic12.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	// 이름 네 개를 입력받아 ArrayList에 저장한 후 제일 긴 이름을 출력할 것.
	
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String s;
		String max = "";
		for(int i=0; i<4; i++) {
			System.out.printf("이름을 입력하세요 > ");
			s = sc.next();
			a.add(s);
		}
		System.out.println();
		for(int i=0; i<a.size(); i++) {
			s = a.get(i);
			if(s.length() > max.length()) {
				max = s;
			}
			System.out.println(s+" ");
		}
		System.out.println("가장 긴 이름: "+max);
		sc.close();
	}
}
