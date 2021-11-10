package homework01;

public class Max {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {4,5,1,3,2};
		for(int i=0; i<array.length; i++) max = array[i]>max?array[i]:max;
		System.out.println("max: "+max);
	}
}
