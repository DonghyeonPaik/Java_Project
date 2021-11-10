package inheritance07.lab10_polymorphism;

public class AnimalTest3 {
	public static void moveAnimal(Animal animal) { // 업캐스팅
		animal.move();
	}
	public static void main(String[] args) {
		
		Human human = new Human();
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		
		// Static key를 이용해서 바로 호출
		AnimalTest3.moveAnimal(human);
		AnimalTest3.moveAnimal(tiger);
		AnimalTest3.moveAnimal(eagle);
	}
}
