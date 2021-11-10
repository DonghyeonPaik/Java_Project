package inheritance07.lab10_polymorphism;

import java.util.ArrayList;

public class AnimalTest4 {
	ArrayList<Animal> aniList = new ArrayList<Animal>();
	
	public void addAnimal() {
		
		// 객체가 ArrayList에 저장될 때 업캐스팅이 됨. Animal type으로.
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani: aniList) {
			ani.move();
		}
	}
	public void testCasting() { // 다운캐스팅: 부모객체를 자식객체로 캐스팅
		for(int i=0; i<aniList.size(); i++) {
			Animal ani = aniList.get(i);
			if(ani instanceof Human) {
				Human h = (Human) ani;
				h.readBook();
			}
			else if(ani instanceof Tiger) {
				Tiger t = (Tiger) ani;
				t.hunting();
			}
			else if(ani instanceof Eagle) {
				Eagle e = (Eagle) ani;
				e.flying();
			}
			else {
				System.out.println("지원되지 않는 타입입니다.");
			}
		}
	}
	public static void main(String[] args) {
		AnimalTest4 aTest = new AnimalTest4();
		aTest.addAnimal();
		aTest.testCasting();
	}
}
