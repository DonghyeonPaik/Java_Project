package generic12.restrict;

public class Powder extends Material{

	@Override
	public void doPrinting() {
		System.out.println("파우더로 프린팅합니다.");
	}

	@Override
	public String toString() {
		return "재료는 파우더입니다.";
	}
	
}
