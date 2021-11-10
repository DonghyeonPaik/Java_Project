package collection.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	/*
	 * TreeSet: 1. 정렬해서 저장 (오름차순)
	 * 				-> 그래서 Comparable의 compareTo()를 Override해야 함!
	 * 			2. 중복된 값도 저장
	 * 			3. index가 없음. 그래서 Iterator를 사용해야 함.
	 */
	
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		System.out.println(treeSet);
		System.out.println("==========");
		treeSet.add("D");
		treeSet.add("K");
		treeSet.add("A");
		treeSet.add("G");
		treeSet.add("Z");
		treeSet.add("X");
		for(String s: treeSet) {
			System.out.print(s+" "); // 자동으로 정렬되어 있음을 확인 가능
		}
		System.out.println();
		
		System.out.println("===== Iterator로 출력 =====");
		Iterator<String> ir = treeSet.iterator();
		while(ir.hasNext()) {
			System.out.print(ir.next()+" ");
		}
	}

}
