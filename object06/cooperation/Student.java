package object06.cooperation;


public class Student {
	// 탑승 가격 초기화
	int busFee = 1000;
	int subwayFee = 1500;
	
	// 필요한 field 생성
	public String name;
	public int grade;
	public int budget;
	
	public Student(String name, int grade, int budget){
		this.name = name;
		this.grade = grade;
		this.budget = budget;
		System.out.println("입력된 학생 이름은 "+name+"이고, "+
				grade+"학년이고, 가진 돈은 "+budget+"입니다.");
	}
	public void takeBus(Bus bus) {
		if(!takeIF(bus.busNumber, busFee)) return;
		bus.take(busFee);
		this.budget -= busFee;
		System.out.println(this.name+"이 버스 "+bus.busNumber+"을 탑승했습니다.");
	}
	public void takeSubway(Subway subway) {
		if(!takeIF(subway.subwayName, subwayFee)) return;
		subway.take(subwayFee);
		this.budget -= subwayFee;
		System.out.println(this.name+"이 지하철 "+
				subway.subwayName+"을 탑승했습니다.");
	}
	boolean takeIF(String name, int fee) {
		if(this.budget-fee < 0) {
			System.out.println(name+"을 타기에는 "
					+this.name+"의 돈이 부족합니다.");
			return false;
		}
		else return true;
	}
	public void showInfo() { // 학생 정보 출력
		System.out.println("학생 "+name+"은 "+grade+
				"학년이고, 남은 돈은 "+budget+"입니다.");
	}
}
