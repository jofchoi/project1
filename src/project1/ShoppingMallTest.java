package project1;

public class ShoppingMallTest {

	public static void main(String[] args) {
		shoppingMall order = new shoppingMall();
		order.orderNum = 201803120001L;
		order.customerID = "abc123";
		order.orderDate = "2018�� 3�� 12��";
		order.orderItemNum = "PD0345-12";
		order.address = "����� �������� ���ǵ��� 20����";

		System.out.println(order.orderNum);
		System.out.println(order.customerID);
		System.out.println(order.orderDate);
		System.out.println(order.orderItemNum);
		System.out.println(order.address);
	}

}
