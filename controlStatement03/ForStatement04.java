package controlStatement03;

public class ForStatement04 {
	public static void main(String[] args){
		/*
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합: "+sum);
		sum = 0;
		for(int i=0; i<=10; i+=2) {
			sum += i;
		}
		System.out.println("1부터 10까지의 2의 배수 합: "+sum);
		*/
		
		int sum = 0;
		for(int i=1; i<101; i++) if(i%15!=0) if(i%3==0||i%5==0) sum += i;
		System.out.println("1부터 100까지의 3 또는 5의 배수 합: "+sum);
		/*
		 * 아니면 아래처럼 해도 됨!
		 * if(i%3==0 ^ i%5==0) ~~~
		 */
		
		for(int i=1; i<5; i++) {
			int k=0;
			for(int j=1; j<5; j++) {
				if(i+j==5) {
					System.out.printf("1 ");
					k=j;
				}
				else System.out.printf("0 ");
			}
			System.out.printf("(%d,%d)%n", i, k);
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) System.out.printf("* ");
			System.out.printf("%n");
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i+j<4) System.out.printf("  ");
				else System.out.printf("* ");
			}
			System.out.printf("%n");
		}
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) System.out.printf("%d * %d = %-5d ", j, i, i*j);
			System.out.printf("%n");
		}
	}

}
