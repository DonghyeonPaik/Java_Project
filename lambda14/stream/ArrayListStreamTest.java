package lambda14.stream;

import java.util.*;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		
		sList.add("Thomas");
		sList.add("Edward");
		sList.add("Jack");
		
		System.out.print("Stream을 사용하지 않고 출력: ");
		for(String s: sList) {
			System.out.print(s+" ");
		}
		System.out.printf("%n%n");
		
		System.out.print("Stream을 사용하여 출력: ");
		Stream<String> stream = sList.stream(); // Collection의 Stream 생성
		stream.forEach(s->System.out.print(s+" "));
		System.out.printf("%n%n");
		System.out.print("Stream을 사용하여 정렬한 후에 출력: [sorted()] ");
		sList.stream().sorted().forEach(s->System.out.print(s+" "));
		System.out.printf("%n%n");
		
		System.out.print("Stream을 사용하여 각 String의 byte수 출력: [map()] ");
		sList.stream().map(s->s.length()).forEach(n->System.out.print(n+" "));
		// map은 모든 요소에 똑같이 적용되도록 함: 위에서는 각 요소의 length()를 생성
//		System.out.printf("%n%nABCDEF의 byte수: "+"ABCDEF".length());
		System.out.printf("%n%n");
		
		System.out.print("Stream을 사용하여 byte수가 5 이상인 성분 출력: [filter()] ");
		sList.stream().filter(s->(s.length()>=5)).forEach(s->System.out.print(s+" "));
		// filter는 모든 요소에서 조건을 걸어서 걸러낼 수 있음
	}
}
