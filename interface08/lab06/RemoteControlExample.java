package interface08.lab06;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		rc.setMute(false);
		rc.setVolume(5);
		rc.setVolume(15);
		rc.turnOff();

		RemoteControl.changeBattery(); // static이므로 바로 호출해서 사용
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		rc.setMute(false);
		rc.setVolume(5);
		rc.setVolume(15);
		rc.turnOff();
	}

}
