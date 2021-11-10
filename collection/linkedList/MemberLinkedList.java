package collection.linkedList;

import java.util.LinkedList;
import collection.Member;

public class MemberLinkedList {
	// field
	private LinkedList<Member> linkedList;
	
	// constructor
	public MemberLinkedList() {
		linkedList = new LinkedList<Member>();
	}
	
	// methods
	public void addMember(Member member) {
		linkedList.add(member);
	}
	public void addMember(int index, Member member) {
		linkedList.add(index, member);
	}
	public boolean removeMember(int memberID) {
		for(int i=0; i<linkedList.size(); i++) {
			Member member = linkedList.get(i);
			int tempID = member.getMemberID();
			if(tempID==memberID) {
				linkedList.remove(i);
				return true;
			}
		}
		System.out.println("ID가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		for(Member m: linkedList) {
			System.out.println(m);
		}
	}
}