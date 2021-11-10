package array05;

public class ReturnArray {
	static int[] makeArray() {
		int[] temp = new int[4];
		for(int i=0; i<temp.length; i++) {
			temp[i] = i;
		}
		return temp;
	}
	public static void main(String[] args) {
		int[] intArray;
		intArray = makeArray();
		for(int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i]+" ");
		}
		System.out.printf("%n===================%n");
		intArray[0] = 50;
		intArray[1] = 60;
		intArray[2] = 70;
		intArray[3] = 80;
		for(int a: intArray) {
			System.out.print(a+" ");
		}
	}
}
