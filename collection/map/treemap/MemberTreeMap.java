package collection.map.treemap;

import java.util.Iterator;
import java.util.TreeMap;
import collection.Member2;

public class MemberTreeMap {
	/*
	 * TreeMap: 1. Key-Value로 구성됨. Key의 값이 서로 같을 수 없음. Value는 중복 가능
	 * 			2. Tree는 정렬해서 저장, Comparable의 compareTo()를 Override해야 함
	 * 			3. 
	 */
	private TreeMap<Integer, Member2> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member2>();
	}
	
	public void addMember(Member2 member) {
		treeMap.put(member.getMemberID(), member);
	}
	public boolean removeMember(int memberID) {
		if(treeMap.containsKey(memberID)) {
			treeMap.remove(memberID);
			return true;
		}
		return false;
	}
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member2 member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
