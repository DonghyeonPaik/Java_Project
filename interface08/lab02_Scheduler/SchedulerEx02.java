package interface08.lab02_Scheduler;

import java.util.Scanner;

public class SchedulerEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch = "";

		while(true) {
			System.out.println("전화 상담 할당 방식을 선택하세요.");
			System.out.println("R: 한 명씩 차례로 할당");
			System.out.println("L: 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P: 우선 순위가 가장 높은 고객에게 할당");
			
			ch = sc.nextLine();
			Scheduler scheduler = null;
			
			if(ch.equals("R") || ch.equals("r")) {
				scheduler = new RoundRobin();
				System.out.println();
			}else if(ch.equals("L") || ch.equals("l")) {
				scheduler = new LeastJob();
				System.out.println();
			}else if(ch.equals("P") || ch.equals("p")) {
				scheduler = new PriorityAllocation();
				System.out.println();
			}else if(ch.equals("그만")) {
				System.out.println("서비스가 종료됩니다.");
				break;
			}else {
				System.out.println("잘못 입력되었습니다.");
				System.out.println();
				continue;
			}
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
			System.out.println();
		}
		sc.close();
	}
}
