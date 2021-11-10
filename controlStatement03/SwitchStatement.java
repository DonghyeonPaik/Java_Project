package controlStatement03;

import java.io.IOException;
import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.printf("1~4 중 하나의 숫자를 입력하세요: ");
		byte b = sc.nextByte();
		
		switch(b){
			case 1: {
				System.out.println("b에 저장된 값은 1");
				break;
			}
			case 2: {
				System.out.println("b에 저장된 값은 2");
				break;
			}
			case 3: {
				System.out.println("b에 저장된 값은 3");
				break;
			}
			case 4: {
				System.out.println("b에 저장된 값은 4");
				break;
			}
			default: {
				System.out.println("해당 범위가 아닌 숫자를 입력했습니다.");
			}
		}
		
		// 계산기 만들기
		System.out.printf("첫번째 숫자를 입력하세요: ");
		int firstNumber = sc.nextInt();
		System.out.printf("연산자 기호를 입력하세요: ");
		char operator = (char)System.in.read();
		System.out.printf("두번째 숫자를 입력하세요: ");
		int secondNumber = sc.nextInt();
		System.out.printf("계산 결과는 다음과 같습니다: ");
		switch(operator) {
			case '+':{
				System.out.printf("%d + %d = %d%n",
						firstNumber, secondNumber, firstNumber+secondNumber);
				break;
			}
			case '-':{
				System.out.printf("%d - %d = %d%n",
						firstNumber, secondNumber, firstNumber-secondNumber);
				break;
			}
			case '*':{
				System.out.printf("%d * %d = %d%n",
						firstNumber, secondNumber, firstNumber*secondNumber);
				break;
			}
			case '/':{
				System.out.printf("%d / %d = %d, 나머지: %d%n",
						firstNumber, secondNumber, firstNumber/secondNumber,
						firstNumber%secondNumber);
				break;
			}
		}
		
		String subject = "수학";
		switch(subject) {
		case "국어": System.out.println("과목은 국어"); break;
		case "영어": System.out.println("과목은 영어"); break;
		case "수학": System.out.println("과목은 수학"); break;
		}
		
		System.out.printf("숫자를 입력하세요: ");
		int inputNum = sc.nextInt();
		switch(inputNum) {
		case 1:
		case 2:
		case 100:
		case 200: System.out.println("1이거나 2이거나 100이거나 200중 하나"); break;
		case 300: System.out.println(inputNum);
		}
		*/
		
		System.out.printf("국어 점수 입력: ");
		int kor = sc.nextInt();
		System.out.printf("영어 점수 입력: ");
		kor += sc.nextInt();
		System.out.printf("수학 점수 입력: ");
		kor += sc.nextInt();
		kor /= 3;
		kor -= kor%10;
		switch(kor) {
		case 100: ;
		case 90: System.out.println("A학점"); break;
		case 80: System.out.println("B학점"); break;
		case 60: System.out.println("C학점"); break;
		default: System.out.println("F학점");
		}
		/*
		 * 아래처럼 짤 수도 있다.
		 * kor /= 30;
		 * switch(kor){
		 * case 10: ~~~;
		 * case 9: ~~~;
		 * }
		 * 
		 */
		
		System.out.printf("메달 색 입력 [Gold or Silver or Bronze]: ");
		String medal = sc.next();
		switch(medal) {
		case "Gold": System.out.println("금메달입니다"); break;
		case "Silver": System.out.println("은메달입니다"); break;
		case "Bronze": System.out.println("동메달입니다"); break;
		default: System.out.println("메달이 없습니다");
		}
		
		sc.close();
	}
}
