package eto;

/**
# ����
������ �ູ�� 1000 �̻����� ������ִ� ���α׷��� ¥����.
 */
public class Life {

	public static void main(String[] args) {

		Person eto = new Person(0,0);
		Company noRangCompany = new Company(10);
		Store noRangChicken = new Store(20000, 100);

		while(eto.getHappiness() < 1000) {
			eto.setMoney(eto.getMoney() + noRangCompany.getDailyPay());

			if(eto.getMoney() > noRangChicken.getCost()) {
				eto.setHappiness(eto.getHappiness() + noRangChicken.getHappiness());
				return;
			}
			else {
				return;
			}
		}
		System.out.println(eto.getHappiness());
		System.out.println(eto.getMoney());
		System.out.println(noRangChicken.getHappiness());
	}
}
