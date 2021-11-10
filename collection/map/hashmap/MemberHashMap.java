package collection.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	/*
	 * Map: 1. key-value 한 쌍씩 저장
	 * 		2. key는 중복된 값을 지정 불가. value는 중복된 값 가능.
	 * 		3. index가 없음
	 * 		4. key는 hash 알고리즘을 사용해서 검색이 빠름.
	 * 		5. 
	 */
	
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberID(), member);
	}
	public boolean removeMember(int memberID) {
		if(hashMap.containsKey(memberID)) {
			// HashMap에서 값을 검색할 때 key값으로 찾음
			
			hashMap.remove(memberID); // key를 삭제하면 value까지 삭제됨
			return true;
		}
		System.out.println(memberID+"가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		System.out.println("Iterator를 이용해서 출력");
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key); // key에 맞는 value를 가져옴
			System.out.println(member);
		}
		System.out.println("Enhanced for문으로 출력");
		for(Integer i: hashMap.keySet()) {
			Member member = hashMap.get(i);
			System.out.println(member);
		}
		System.out.println();
	}
}
