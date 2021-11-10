package inheritance07.lab10_polymorphism;

public class AnimalTest2 { // Stack 영역에 메소드 저장
	
	public static void moveAnimal(Animal animal) { // 업캐스팅
		animal.move();
	}
	public static void main(String[] args) {
		
		// Static key를 이용해서 바로 호출
		AnimalTest2.moveAnimal(new Human());
		AnimalTest2.moveAnimal(new Tiger());
		AnimalTest2.moveAnimal(new Eagle());
	}
}
