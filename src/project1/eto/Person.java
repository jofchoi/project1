package eto;
/**Person 클래스 생성. 돈, 행복 멤버필드 추가.
 * 
 * @author user
 *
 */
public class Person {
	private int money;
	private int happiness;
	
	public Person(int money, int happiness) {
		this.money = money;
		this.happiness = happiness;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getHappiness() {
		return happiness;
	}
	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}
	public void works(int dailyPay) {
		this.money = this.money + dailyPay;
	}
	public void eatsChicken(int cost, int happiness2) {
		if(this.money >= cost) {
			this.happiness = this.happiness + happiness2;
		}		
	}
}
