package controlStatement03;

import java.io.IOException;

public class IfStatement03 {

	public static void main(String[] args) throws IOException {
		
		/*
		System.out.printf("한 문자를 입력하세요: ");
		int word = System.in.read();
		if(word>=48&&word<=57) {
			System.out.println(word%2==0?"2의 배수":"2의 배수가 아님");
		} else if(word>=65&&word<=90) {
			System.out.println("대문자");
		} else if(word>=97&&word<=122) {
			System.out.println("소문자");
		} else;
		
		System.out.printf("한 문자를 입력하세요: ");
		char word = (char)System.in.read();
		if(word>=48&&word<=57) System.out.println("숫자");
		else if((word>=65&&word<=90)||(word>=97&&word<=122)) System.out.println("알파벳");
		else System.out.println("기타");
		*/
		int num1=44, num2=20, num3=10;
		if(num1>num2) System.out.println("최댓값: "+((num1>num3)?num1:num3));
		else System.out.println("최댓값: "+(num2>num3?num2:num3));
	}
}