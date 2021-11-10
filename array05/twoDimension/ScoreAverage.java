package array05.twoDimension;

public class ScoreAverage {
	
	public static void main(String[] args) {
		
		//                  {1학기, 2학기}
		double score[][] = {{3.3, 3.4},
							{3.5, 3.6},
							{3.7, 4.0},
							{4.1, 4.2}};
		double sum = 0;
		int year=0, term=0;
		
		for(year=0; year<score.length; year++) {
			for(term=0; term<score[year].length; term++) {
				sum+=score[year][term];
			}
		}
		System.out.printf("전체 성적 합은 %.1f입니다.%n", sum);
		System.out.printf("평균 학점은 %.2f입니다.%n",sum/(year*term));
	}
}