package leeSeungHoon;

public class Person {
	long money;
	long happy;
	
	public Person(long money, long happy) {
		this.money = money;
		this.happy = happy;
	}
	
	public void work(long pay) {
		this.money += pay;
		
	}

	public void buy(int happy) {
		this.happy += happy;
	}
	
	public void showInfo() {
		System.out.println(money + ", " + happy);
	}
}
