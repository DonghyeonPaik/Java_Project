package object06.cooperation;

public class TakeTrans {
	
	public static void main(String[] args){
		// 학생 및 대중교통 객체 생성
		System.out.printf("\t[ 입력된 학생들과 예산 확인 ]%n");
		Student john = new Student("John", 11, 12000);
		Student max = new Student("Max", 9, 3500);
		Student kim = new Student("Kim", 12, 5000);
		Bus bus10 = new Bus("10번");
		Bus bus720 = new Bus("720번");
		Subway subway1 = new Subway("1호선");
		Subway subway7 = new Subway("7호선");
		
		// 학생 대중교통 탑승 입력
		System.out.printf("%n\t[ 학생들의 대중교통 탑승 내역 ]%n");
		john.takeBus(bus10);
		john.takeBus(bus10);
		john.takeSubway(subway1);
		john.takeBus(bus720);
		max.takeBus(bus720);
		kim.takeSubway(subway1);
		kim.takeSubway(subway1);
		john.takeSubway(subway7);
		john.takeBus(bus10);
		john.takeSubway(subway7);
		john.takeSubway(subway1);
		kim.takeBus(bus720);
		kim.takeSubway(subway7);
		kim.takeBus(bus720);
		john.takeSubway(subway1);
		max.takeSubway(subway7);
		max.takeBus(bus720);
		max.takeBus(bus720);
		john.takeBus(bus10);
		
		// 대중교통 승객 및 수입 확인
		System.out.printf("%n\t[ 대중교통 누적 승객 및 수입 ]%n");
		bus10.showInfo();
		bus720.showInfo();
		subway1.showInfo();
		subway7.showInfo();
		
		// 학생 정보 확인
		System.out.printf("%n\t[ 학생들의 남은 돈 확인 ]%n");
		john.showInfo();
		max.showInfo();
		kim.showInfo();
	}
}
