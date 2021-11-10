package array05;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] array1 = {10,20,30,40,50};
		int[] array2 = {1,2,3,4,5};
		int[] array3 = new int[10];
		int[] array4 = new int[20];
		
		// (복사할 원본, 원본 주소, 복사할 대상, 대상 주소, 복사할 개수)
		System.arraycopy(array2, 0, array3, 0, 5);
		System.arraycopy(array1, 0, array2, 0, 5);
		System.arraycopy(array2, 0, array3, 5, 5);
		
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
		System.out.println("==========");
		for(int i=0; i<array3.length; i++) {
			System.out.println(array3[i]);
		}
		System.out.println("==========");
		System.arraycopy(array3, 0, array4, 3, 10);
		System.arraycopy(array3, 0, array4, 13, 5);
		
		for(int i=0; i<array4.length; i++) {
			System.out.println(array4[i]);
		}
	}
}
