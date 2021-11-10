package collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member; // 다른 package의 class를 사용하기 위한 import

public class MemberArrayList {
	// field
	private ArrayList<Member> arrayList;

	// constructor
	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); // ArrayList<Member> 생성
	}

	// method
	public void addMember(Member member) {
		arrayList.add(member);
	}
	public void addMember2(int a, Member member) { // index를 지정해서 삽입
		arrayList.add(a, member);
	}
	public boolean removeMember(int memberID) {
		/*
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempID = member.getMemberID();
			if (tempID == memberID) {
				arrayList.remove(i);
				return true;
			}
		}*/
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempID = member.getMemberID();
			if(tempID==memberID) {
				arrayList.remove(member);
				return true;
			}
		}
		
		System.out.println("아이디 "+memberID + "가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		
		for(Member m: arrayList) {
			System.out.println(m);
		}
		
/*		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}*/
		System.out.println();
	}
}