package array05;

public class ForEachLoop { // 향상된 for문
	// 배열의 처음부터 마지막까지 순환하면서 값을 출력할 경우

	public static void main(String[] args) {
		String[] strArr = {"Java", "Android", "C", "JavaScript", "Python"};
		
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		System.out.println("=====Enhanced For=====");
		for(String lang: strArr) {
			System.out.println(lang);
		}
	}
}
