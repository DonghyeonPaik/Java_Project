package inheritance07.lab4.arraylist;

import java.util.ArrayList;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		// 아래는 모두 다른 타입이지만 Customer 타입으로 (up~)casting함.
		// 이는 ArrayList에 넣기 위해서임.
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		// 아래는 모두 Customer 타입으로 업캐스팅함.
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerYul = new GoldCustomer(10040, "이율곡");
		Customer customerKim = new VIPCustomer(10050, "김유신", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKim);
		
		System.out.println("========== 고객 정보 출력 ==========");
		for(Customer c: customerList) {
			System.out.println(c.showCustomerInfo());
		}
		System.out.println("========== 보너스 포인트와 할인율 계산 ==========");
		int price = 10000;
		for(Customer c: customerList) {
			int cost = c.calcPrice(price);
			System.out.println(c.getCustomerName()+"님은 "+cost+"원 지불하셨습니다.");
			System.out.println(c.getCustomerName()+"님의 현재 포인트는 "
					+c.bonusPoint+"점입니다.");
		}
	}
}
