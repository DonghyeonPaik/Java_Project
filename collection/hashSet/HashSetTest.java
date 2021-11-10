package collection.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	/*
	 * HashSet: 1. 순서대로 저장되지 않는다. 즉, index가 없다.
	 * 			2. 중복된 값을 저장할 수 없다.
	 * 			3. 출력, 삭제할 때 Iterator를 사용함.
	 */
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("임정순");
		hashSet.add("홍길동");
		hashSet.add("이순신");
		hashSet.add("강감찬");
		hashSet.add("강감찬");
		System.out.println(hashSet); // toString()이 재정의되어 있음
		
		System.out.println("===== Iterator를 이용해서 출력 =====");
		Iterator<String> ir = hashSet.iterator(); // Iterator 생성
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
		System.out.println("===== 특정 값 삭제 =====");
		hashSet.remove("강감찬");
		ir = hashSet.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}

}
