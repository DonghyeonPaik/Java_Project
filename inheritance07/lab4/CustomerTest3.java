package inheritance07.lab4;

public class CustomerTest3 {
	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 10000;
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		customerKim.bonusPoint = 10000;
		
		int price = 10000;
		
		System.out.println(customerLee.getCustomerName()+
				"님이 지불해야 할 금액은 "+customerLee.calcPrice(price));
		System.out.println(customerKim.getCustomerName()+
				"님이 지불해야 할 금액은 "+customerKim.calcPrice(price));
		// 동적 바인딩: 동일한 메소드가 부모 자식 클래스에 모두 존재할 경우
		//          자식 클래스의 메소드로 바인딩이 되는 것!
	}
}
