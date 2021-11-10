package ex.chap06;

import java.util.*;

public class BankApplication {
	private static ArrayList<Account> arr = new ArrayList<Account>();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택 >> ");
			int selectNo = scanner.nextInt();
			if(selectNo==1) {
				createAccount();
			}else if(selectNo==2) {
				accountList();
			}else if(selectNo==3) {
				deposit();
			}else if(selectNo==4) {
				withdraw();
			}else if(selectNo==5) run=false;
			else System.out.println("잘못 입력했습니다. 다시 입력하세요");
		}
		System.out.println("프로그램 종료");
	}
	private static void createAccount() {
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		
		Account account = new Account(ano, owner, balance);
		arr.add(account);
		System.out.println("결과: 계좌가 생성되었습니다.");
	}
	private static void accountList() {
		System.out.println("----------");
		System.out.println("계좌목록");
		System.out.println("----------");
		
		for(Account acc: arr) {
			System.out.println(acc.getAno()+"\t"+
					acc.getOwner()+"\t"+acc.getBalance());
		}
	}
	private static void deposit() {
		System.out.println("----------");
		System.out.println("예금");
		System.out.println("----------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int balance = scanner.nextInt();
		
		Account account = findAccount(ano);
		if(account==null) {
			System.out.println("결과: 해당하는 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() + balance);
		System.out.println("결과: 예금이 성공되었습니다.");
	}
	private static void withdraw() {
		System.out.println("----------");
		System.out.println("출금");
		System.out.println("----------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int balance = scanner.nextInt();
		
		Account account = findAccount(ano);
		if(account==null) {
			System.out.println("결과: 해당하는 계좌가 없습니다.");
			return;
		}
		if(account.getBalance()<balance) {
			System.out.println("출금액이 예금액보다 많아서 출금이 거부되었습니다.");
			return;
		}
		account.setBalance(account.getBalance() - balance);
		System.out.println("결과: 출금이 성공되었습니다.");
	}
	private static Account findAccount(String ano) {
		Account account = null;
		for(Account acc: arr) {
			if(acc!=null) {
				if(acc.getAno().equals(ano)) {
					account = acc;
					break;
				}
			} else break;
		}
		return account;
	}
}