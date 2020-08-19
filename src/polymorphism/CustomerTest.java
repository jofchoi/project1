package polymorphism;
import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();

		Customer customerLee = new Customer(10010, "Lee");
		Customer customerShin = new Customer(10020, "Shin");
		Customer customerHong = new GoldCustomer(10030, "Hong");
		Customer customerYoul = new GoldCustomer(10040, "Youl");
		Customer customerKim = new VipCustomer(10050, "Kim", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
		System.out.println("===========info=========");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("=====discountrate and bonusPoint=====");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.customerName + "님이" + cost + "냇음");
			System.out.println(customer.customerName + "님의 현재 보너스포인트는" + customer.bonusPoint);
		}
		
	}
}
