package inheritance07.lab11_instanceof;

class Animal{}
class Human extends Animal{}
class Tiger extends Animal{}
class Lion extends Animal{}
class Eagle extends Animal{}
class HumanChild extends Human{}
class HumanChildson extends HumanChild{}

public class InstanceOfEx02 {
	
	static void print(Animal animal) {
		
		if(animal instanceof Animal) {
			System.out.printf("동물입니다. ");
		}
		else {
			// error
		}
		if(animal instanceof Human) {
			System.out.printf("사람입니다. ");
			if(animal instanceof HumanChild) {
				System.out.printf("HumanChild입니다. ");
				if(animal instanceof HumanChildson) {
					System.out.printf("HumanChildson입니다. ");
				}
			}
		}else if(animal instanceof Tiger) {
			System.out.printf("호랑이입니다. ");
		}else if(animal instanceof Lion) {
			System.out.printf("사자입니다. ");
		}else if(animal instanceof Eagle) {
			System.out.printf("독수리입니다. ");
		}else {
			// error
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		System.out.printf("new Animal -> ");
		print(new Animal());
		System.out.printf("new Human -> ");
		print(new Human());
		System.out.printf("new Tiger -> ");
		print(new Tiger());
		System.out.printf("new Lion -> ");
		print(new Lion());
		System.out.printf("new Eagle -> ");
		print(new Eagle());
		System.out.printf("new HumanChild -> ");
		print(new HumanChild());
		System.out.printf("new HumanChildren -> ");
		print(new HumanChildson());
	}
}
