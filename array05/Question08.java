package array05;

public class Question08 {
	public static void main(String[] args) {
		int[][] array= {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		for(int[] i: array) {
			for(int j: i) {
				sum+=j;
				avg++;
			}
		}
		avg = sum/avg;
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);
	}
}
