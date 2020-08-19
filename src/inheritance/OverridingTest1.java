package inheritance;

public class OverridingTest1 {
	public static void main(String[] args) {
		Customer customerLee = new Customer(10010,"Lee");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020, "KIM", 12345);
		customerKim.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName() + " price is "+ customerLee.calcPrice(price));
		System.out.println(customerKim.getCustomerName() + " price is " + customerKim.calcPrice(price));
	}
}
