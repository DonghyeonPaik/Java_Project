package inheritance07.abstract_gamelevel;

public class AdvancedLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("적당히 점프합니다.");
	}

	@Override
	public void turn() {
		System.out.println("반바퀴 돕니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("===== 중간 레벨입니다. =====");
	}
}
