package eto;
/**Person Ŭ���� ����. ��, �ູ ����ʵ� �߰�.
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
}
