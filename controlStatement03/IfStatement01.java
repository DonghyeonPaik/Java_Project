package controlStatement03;

import java.io.IOException;

public class IfStatement01 {
	public static void main(String[] args) throws IOException {
		/*
		// if의 조건식은 boolean으로 결과가 나와야 함!
		int a = 1, sum = 0;
		while(true) {
			if(a < 11) {
				sum += a;
				a++;
			}
			else break;
		}
		System.out.printf("%d%n%n", sum);
		System.out.printf("1. 한 문자를 입력하세요: ");
		int asciiCode = System.in.read();
		System.out.printf("%n입력된 문자: %c, 입력된 ascii number: %d%n",
				(char)asciiCode, asciiCode);
		boolean isNumber = asciiCode>=48 && asciiCode<=57;
		if(isNumber) {
			System.out.println("입력된 문자는 숫자입니다.");
		} else {
			System.out.println("입력된 문자는 숫자가 아닙니다.");
		}
		
		// 직접 해봐라
		System.out.printf("한 문자를 입력하세요: ");
		int ascii = System.in.read();
		boolean isAlphabetOrNumber = (ascii>='0'&&ascii<='9')||
				(ascii>='A'&&ascii<='Z')||(ascii>='a'&&ascii<='z');
		if(isAlphabetOrNumber) {
			System.out.println("\n알파벳 혹은 숫자");
		}
		if(!isAlphabetOrNumber) {
			System.out.println("\n기타");
		}
		
		// 만약 char로 밭으면 어떻게 될까?
		System.out.println("한 문자 입력: ");
		char word = (char)System.in.read();
		System.out.println("입력한 문자: "+(int)word);
		word = (char)System.in.read();
		System.out.println("입력한 문자: "+(int)word);
		word = (char)System.in.read();
		System.out.println("입력한 문자: "+(int)word);
		// 97이 잘 뜬 후, 13과 10이 출력되는데, 이는 개행 아스키 코드 때문.
		// \r은 아스키 코드로 13, \n은 아스키 코드로 10이므로
		// char로 받으면 이들을 같이 읽어서 이런 overflow가 발생하는 것.
		*/
		// 또다른 문제
		System.out.printf("한 문자를 입력하세요: ");
		int ascii = System.in.read();
		boolean isNumber = ascii>=48&&ascii<=57;
		if(isNumber) {
			if(ascii>48) {
				boolean isEven = ascii%2==0?true:false;
				if(isEven) {
					System.out.println("2의 배수입니다.");
					return;
				}				
			}
		}
		System.out.println("2의 배수가 아닙니다.");
		
		System.out.printf("한 문자를 입력하세요: ");
		ascii = System.in.read();
		if((ascii>=48&&ascii<=57)?true:false) System.out.println("숫자입니다.");
		// ascii>=48&&ascii<=57 자체가 true이면 1이고 false이면 0이므로 삼항연산자를 쓸 필요가 없다!
		else System.out.println("숫자가 아닙니다.");
		
	}
}
