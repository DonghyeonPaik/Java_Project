package collection.linkedList;

import collection.Member;

public class MemberLinkedListTest {

	public static void main(String[] args) {
		MemberLinkedList memberList = new MemberLinkedList();

		Member memberKim = new Member(1001, "Kim");
		Member memberPark = new Member(1002, "Park");
		Member memberJohn = new Member(1003, "John");
		Member memberHong = new Member(1004, "Hong");
		Member memberMoon = new Member(1005, "Moon");
		System.out.println("=====초기화 상태에서 지우기=====");
		memberList.removeMember(1001);
		System.out.println();
		System.out.println("=====회원 입력=====");
		memberList.addMember(memberKim);
		memberList.addMember(memberPark);
		memberList.addMember(memberJohn);
		memberList.addMember(memberHong);
		memberList.showAllMember();
		System.out.println();
		System.out.println("=====아이디 1002 회원 지우기=====");
		memberList.removeMember(1002);
		memberList.showAllMember();
		System.out.println();
		System.out.println("=====아이디 1005 회원 추가하기=====");
		memberList.addMember(1, memberMoon);
		memberList.showAllMember();
	}
}
