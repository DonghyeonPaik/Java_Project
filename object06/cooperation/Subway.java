package object06.cooperation;

public class Subway {
	public String subwayName;
	public int passengerCount;
	public int earn;
	
	Subway(String subwayName){ // 생성자
		this.subwayName = subwayName;
	}
	public void take(int earn) {
		this.earn += earn;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println("지하철 "+subwayName+"의 승객은 "+passengerCount+
				"이고, 수입은 "+earn+"입니다.");
	}
}
