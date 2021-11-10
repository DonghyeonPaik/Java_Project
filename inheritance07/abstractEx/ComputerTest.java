package inheritance07.abstractEx;

import java.util.ArrayList;

public class ComputerTest {
	public static void main(String[] args) {
		
//		Computer c1 = new Computer(); 추상 클래스라서 객체 생성 불가
		Computer c2 = new Desktop();
//		Computer c3 = new Notebook(); 추상 클래스라서 객체 생성 불가
		Computer c4 = new MyNotebook();
		
		System.out.println(" ====== Desktop 객체 정보 ====== ");
		c2.display();
		c2.typing();
		c2.turnOn();
		c2.turnOff();
		
		
		System.out.println(" ====== MyNotebook 객체 정보 ====== ");
		c4.display();
		c4.typing();
		c4.turnOn();
		c4.turnOff();
		
		System.out.println(" ====== 각각의 클래스 메소드 호출[다운캐스팅] ======");
		
		Desktop d = (Desktop) c2;
		d.turnOn();
		d.display();
		d.typing();
		d.desktopOnly();
		d.turnOff();
		
		System.out.println();
		
		MyNotebook m = (MyNotebook) c4;
		m.turnOn();
		m.display();
		m.typing();
		m.notebookOnly();
		m.myNotebookOnly();
		m.turnOff();
		
		
		System.out.println(" ====== 각 클래스를 ArrayList에 저장 후 출력 ====== ");
		ArrayList<Computer> computers = new ArrayList<Computer>();
		computers.add(d);
		computers.add(m);
		Computer cp;
		for(int i=0; i<computers.size(); i++) {
			cp = computers.get(i);
			if(cp instanceof Computer) {
				System.out.printf("컴퓨터입니다. ");
			}
			if(cp instanceof Desktop) {
				System.out.println("데스크탑입니다. ");
			}
			if(cp instanceof Notebook) {
				System.out.println("노트북입니다. ");
			}
			if(cp instanceof MyNotebook) {
				System.out.println("MyNotebook입니다. ");
			}
			System.out.println();
		}
	}
}
