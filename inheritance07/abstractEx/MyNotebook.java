package inheritance07.abstractEx;

public class MyNotebook extends Notebook {
	
	@Override
	public void typing() {
		System.out.println("노트북 키보드");
	}
	
	public void myNotebookOnly() {
		System.out.println("노트북에만 있는 메소드 - myNotebook");
	}
}
