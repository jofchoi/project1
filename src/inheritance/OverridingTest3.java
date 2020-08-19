package inheritance;

public class OverridingTest3 {
	public static void main(String[] args) {
		int price = 10000;
		
		Customer lee = new Customer(10010, "LEE");
		System.out.println(lee.getCustomerName() + " price is " + lee.calcPrice(price));
		
		VIPCustomer kim = new VIPCustomer(10020, "KIM", 12345);
		System.out.println(kim.getCustomerName() + " price is " + kim.calcPrice(price));
		
		Customer vc = new VIPCustomer(10030, "VC", 2000);
		System.out.println(vc.getCustomerName() + " price is " + vc.calcPrice(price));
	}
}
