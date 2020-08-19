package inheritance;

public class OverridingTest2 {
	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "NONAME", 2000);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName() + " price is "+ vc.calcPrice(10000));
	}
}
