package collection.treeSet;

import java.util.Iterator;
import java.util.TreeSet;
import collection.Member;
import collection.Member2;

public class MemberTreeSet {
	private TreeSet<Member2> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member2>();
	}
	
	public void addMember(Member2 member) {
		treeSet.add(member);
	}
	public boolean removeMember(int memberID) {
		Iterator<Member2> ir = treeSet.iterator();
		while(ir.hasNext()) {
			Member2 member = ir.next();
			int tempID = member.getMemberID();
			if(tempID==memberID) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println("해당하는 아이디가 없습니다.");
		return false;
	}
	public void showAllMember() {
		/*
		for(Member m: treeSet){
			System.out.println(m);
		}
		 */
		Iterator<Member2> ir = treeSet.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}
}