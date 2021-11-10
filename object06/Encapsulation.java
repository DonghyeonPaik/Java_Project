package object06;

class Encapsulation {
	String name;
	int age;
	void eat(String Feed) {
		System.out.println(Feed+", So Yummy!");
	}
	void speak(int numberOfSpeaking) {
		while(numberOfSpeaking > 0) {
			System.out.printf("BowWow ");
			numberOfSpeaking--;
		}
		System.out.println();
	}
	void love(String You) {
		System.out.println(You+", I love you!");
	}
}
class Human extends Encapsulation {
	String job;
	String hobby;
	void work() {
		
	}
	void cry() {
		
	}
	void laugh() {
		
	}
}
class Mother extends Human{
	String siblings;
}