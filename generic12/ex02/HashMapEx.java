package generic12.ex02;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {
	// 단어검색장(영문, 한글)을 hashmap에 저장하고 영어를 넣었을 때 한글을 출력하도록
	
	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		while(true) {
			System.out.printf("찾고 싶은 단어는? > ");
			String eng = sc.next();
			if(eng.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			String kor = dic.get(eng);
			if(kor==null) {
				System.out.println("검색 결과가 없습니다.");
			}else {
				System.out.println("검색결과: "+kor);
			}
			
			System.out.println();
		}
		sc.close();
	}
}
