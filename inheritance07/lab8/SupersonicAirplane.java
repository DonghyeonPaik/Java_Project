package inheritance07.lab8;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override // override annotation: 메소드 재정의할 때 오류 방지를 위해 사용
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		}
		else {
			super.fly();
		}
	}
	// 메소드 오버라이딩: 부모 클래스의 메소드를 자식 클래스에서 재정의해서 쓰는 것.
	// 메소드를 자식이 덮어쓴다고 생각하면 됨.
	// 단, 접근 제한을 더 강하게 하진 못함.(약하게는 가능)
}
