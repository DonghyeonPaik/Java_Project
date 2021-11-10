package homework01;

import java.util.*;

public class Number13 {
	public static void main(String[] args) {
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int[] amount = new int[8];
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("금액을 입력하시오 >> ");
		int inputMoney = sc.nextInt();
		sc.close();
		while(inputMoney>0) {
			if(inputMoney>=50000) {
				inputMoney-=50000;
				amount[0]++;
			}
			else if(inputMoney>=10000) {
				inputMoney-=10000;
				amount[1]++;
			}
			else if(inputMoney>=1000) {
				inputMoney-=1000;
				amount[2]++;
			}
			else if(inputMoney>=500) {
				inputMoney-=500;
				amount[3]++;
			}
			else if(inputMoney>=100) {
				inputMoney-=100;
				amount[4]++;
			}
			else if(inputMoney>=50) {
				inputMoney-=50;
				amount[5]++;
			}
			else if(inputMoney>=10) {
				inputMoney-=10;
				amount[6]++;
			}
			else {
				amount[7] = inputMoney;
				break;
			}
		}
		for(int i=0; i<amount.length; i++) System.out.printf("%d 원 짜리: %d 개%n", unit[i], amount[i]);
	}
}
