package project1;

public class ShoppingMallTest {

	public static void main(String[] args) {
		shoppingMall order = new shoppingMall();
		order.orderNum = 201803120001L;
		order.customerID = "abc123";
		order.orderDate = "2018년 3월 12일";
		order.orderItemNum = "PD0345-12";
		order.address = "서울시 영등포구 여의도동 20번지";

		System.out.println(order.orderNum);
		System.out.println(order.customerID);
		System.out.println(order.orderDate);
		System.out.println(order.orderItemNum);
		System.out.println(order.address);
	}

}
