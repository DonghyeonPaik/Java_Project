package exception10;

public class A {
	public static void main(String[] args) {
		try {
			System.out.println("7 나누기 0은? ");
			System.out.println(7/0);
		}catch(Exception e){
			System.out.println("Exception: "+e);
		}
	}
}
