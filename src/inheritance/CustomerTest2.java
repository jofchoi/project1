package inheritance;

public class CustomerTest2 {
	public static void main(String[] args) {
		VIPCustomer customerKim = new VIPCustomer(10020, "KIM", 10000);
		/*customerKim.setCustomerID(10020);
		customerKim.setCustomerName("KIM");
		*/
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
	}
}
