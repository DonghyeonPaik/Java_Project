package inheritance07.lab12_method_overriding;

class Weapon{
	protected int fire() {
		return 1;
	}
}
class Cannon extends Weapon{
	@Override
	protected int fire() {
		return 10;
	}
	protected void info() {
		System.out.println("대포는 기본 살상능력보다 10배 좋습니다.");
	}
}

public class Overriding {
	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 살상 능력은 "+weapon.fire());
		weapon = new Cannon();
		System.out.println("대포의 살상 능력은 "+weapon.fire());
		
		Cannon c = (Cannon)weapon;
		c.info();
	}
}
