package inheritance07.abstractEx;

public abstract class Notebook extends Computer {
	// 추상 클래스를 상속관계로 잡으려면 역시 추상 클래스여야 함.
	@Override
	public void display() {
		System.out.println("노트북 모니터");
	}
	
	public void notebookOnly() {
		System.out.println("노트북에만 존재하는 메소드 - notebook");
	}
}
