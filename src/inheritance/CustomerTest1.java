package inheritance;

public class CustomerTest1 {
	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("lee");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		Customer customerKim = new Customer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("Kim");
		customerKim.bonusPoint = 1000;
		System.out.println(customerKim.showCustomerInfo());
	}
}
