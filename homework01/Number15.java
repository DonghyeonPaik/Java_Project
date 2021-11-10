package homework01;

public class Number15 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i%3!=0 || i==0) {
				System.out.printf("%n%d 박수 짝", i*10+3);
				System.out.printf("%n%d 박수 짝", i*10+6);
				System.out.printf("%n%d 박수 짝", i*10+9);
			}
			else {
				for(int j=0; j<10; j++) {
					System.out.printf("%n%d 박수 짝", i*10+j);
					if(j%3==0 && j!=0) {
						System.out.printf("짝");
					}
				}
			}
		}
	}
}
