package controlStatement03;

import java.io.IOException;

public class IfStatement02 {

	public static void main(String[] args) throws IOException {
		
		System.out.printf("한 문자를 입력하세요: ");
		int ascii = System.in.read();
		if(ascii>=48&&ascii<=57) {
			if(ascii%2==0) System.out.println("2의 배수입니다.");
			else System.out.println("2의 배수가 아닙니다.");
		} else {
			if(ascii>=65&&ascii<=90) System.out.println("대문자입니다.");
			else System.out.println("소문자입니다");
		}

	}

}
