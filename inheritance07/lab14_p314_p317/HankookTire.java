package inheritance07.lab14_p314_p317;

public class HankookTire extends Tire {
	// field
	// 생성자
	public HankookTire(String location, int maxRotation) {	
		super(location, maxRotation);
	}
	
	// method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+" HankookTire 수명: "+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("*** "+location+" HankookTire 펑크 ***");
			return false;
		}
	}
}
