package homework01;

import java.util.*;

public class Number17 {
	public static void main(String[] args) {
		String str[] = {"가위", "바위", "보"};
		String inputString;
		int n, c=0;
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.printf("가위 바위 보! >> ");
			inputString = sc.next();
			if(inputString.equals("그만")) break;
			n = (int)(Math.random()*3);
			System.out.printf("사용자 = %s, 컴퓨터 = %s ", inputString, str[n]);
			for(int i=0; i<str.length; i++) {
				if(str[i].equals(inputString)) {
					if(n==i) {
						System.out.printf("비겼습니다.%n");
						break;
					}
					else if((n==0&&i==1)||(n==1&&i==2)||(n==2&&i==0)) {
						System.out.printf("사용자가 이겼습니다.%n");
						break;
					}
					else {
						System.out.printf("컴퓨터가 이겼습니다.%n");
						break;
					}
				}
				if(i>1) System.out.printf("잘못 입력했습니다.%n");
			}
		}
		sc.close();
		System.out.println("게임을 종료합니다...");
	}
}
