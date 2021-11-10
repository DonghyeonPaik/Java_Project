package object06.singleton;

public class SingletonExample {
	public static void main(String[] args) {
//		Singleton obj1 = new Singleton();
//		Singleton obj2 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1==obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		}else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
		// 객체를 출력할 경우 자신의 주소값이 출력됨.
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
