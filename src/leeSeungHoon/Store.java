package leeSeungHoon;

public class Store {
	long cost = 20;
	long happy;
	long workingDays;

	public void buy(Person person) {
			if(person.money > cost) {
				this.happy -= 100;
				person.buy(100);
			}
			else {
				return;
			}

	}

	public void storeInfo() {
		System.out.println(happy);
	}

}
