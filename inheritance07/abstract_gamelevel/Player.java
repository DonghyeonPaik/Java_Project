package inheritance07.abstract_gamelevel;

public class Player {
	private PlayerLevel level;
	
	public Player() {
		level = new BeginerLevel();
		level.showLevelMessage();
	}
	public PlayerLevel getLevel() {
		return level;
	}
	public void play(int count) {
		level.go(count);
	}
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
}
