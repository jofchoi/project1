package polymorphism;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "LEE");
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		Customer customerKim = new VipCustomer(10020, "KIM", 12345);
		customerKim.bonusPoint = 1000;
		
		System.out.println(customerKim.showCustomerInfo());
		System.out.println("========�������� ���ʽ� ����Ʈ ���");
		
		int price = 10000;
		int leeprice = customerLee.calcPrice(price);
		int kimprice = customerKim.calcPrice(price);
		
		System.out.println((customerLee.customerName) +"����  " + leeprice );
		System.out.println(customerLee.showCustomerInfo());
		System.out.println((customerKim.customerName) + "���� " + kimprice);
		System.out.println(customerKim.showCustomerInfo());
	}
}
