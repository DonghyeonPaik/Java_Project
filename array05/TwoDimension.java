package array05;

public class TwoDimension {
	public static void main(String[] args) {
		System.out.println("initialize 2by3 array...");
		int[][] arr = {{1,2,3},{4,5,6}};
		
		// arr.length: 행의 수
		// arr[i].length: 열의 수
		System.out.println("array's length(height): "+arr.length);
		System.out.println("array's width: "+arr[0].length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("row "+i);
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("(%d, %d): %d%n",i, j, arr[i][j]);	
			}
		}
		System.out.println("=====modify=====");
		arr[0][2] = 150;
		arr[1][2] = 300;
		for(int i=0; i<arr.length; i++) {
			System.out.println("row "+i);
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("(%d, %d): %d%n",i, j, arr[i][j]);	
			}
		}
	}
}