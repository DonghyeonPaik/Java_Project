package controlStatement03;

public class BreakStatement {
	public static void main(String[] args) {
		int num, sum=0;
		
		outter: for(num=0;num<2;num++) {
			System.out.println("outter2");
			break outter;
		}
	}
}
