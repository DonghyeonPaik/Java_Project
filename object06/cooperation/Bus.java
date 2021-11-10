package object06.cooperation;

public class Bus {
	// 필요한 field 생성
	String busNumber;
	int passengerCount;
	int earn;
	
	public Bus(String busNumber){ // 생성자
		this.busNumber = busNumber;
	}
	public void take(int earn) { // 버스의 수입 및 승객수를 늘리는 메소드
		this.earn += earn;
		passengerCount++;
	}
	public void showInfo() { // 버스 정보 출력
		System.out.println("버스 "+busNumber+"번의 승객은 "+passengerCount+
				"이고, 수입은 "+earn+"입니다.");
	}
}
