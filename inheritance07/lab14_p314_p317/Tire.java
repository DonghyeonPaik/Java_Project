package inheritance07.lab14_p314_p317;

public class Tire {
	// field
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// method
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+" Tire 수명: "+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("*** "+location+" Tire 펑크 ***");
			return false;
		}
	}
}
