package generic12;

public class Water {
	public void doPrinting() {
		System.out.println("물 재료로 출력합니다.");
	}
	
	@Override
	public String toString() {
		return "재료는 water입니다.";
	}
}
