package array05.twoDimension;

public class IrregularArray {
	public static void main(String[] args) {
		int intArray[][] = new int[4][]; // 비정방형 배열의 선언: 행 개수만 선언
		intArray[0] = new int[3];
		intArray[1] = new int[2];
		intArray[2] = new int[3];
		intArray[3] = new int[2];
		
		for(int i=0; i<intArray.length; i++) {
			for(int j=0; j<intArray[i].length; j++) {
				intArray[i][j] = (i+1)*10+j;
			}
		}
		System.out.println("  |  0  1  2");
		System.out.println("__|_________");
		for(int i=0; i<intArray.length; i++) {
			System.out.printf("%d | ", i);
			for(int j=0; j<intArray[i].length; j++) {
				System.out.printf("%d ", intArray[i][j]);
			}
			System.out.println();
		}
	}
}