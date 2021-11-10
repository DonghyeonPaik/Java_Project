package exception10.custom_Exception.p444;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		// 입금
		account.deposit(10000);
		System.out.println("예금액: "+account.getBalance());
		
		// 출금
		try {
			account.withdrawl(30000);
		}catch(BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}
	}
}
