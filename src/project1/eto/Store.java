package eto;
/**- Store Ŭ���� ����. ���� �ູ ����ʵ� �߰�. buy �޼ҵ带 �߰�. 
  buy �޼ҵ�� Person�� ���� �Ķ���ͷ� �ް�, 
     �� ���� ��뺸�� ������ Ȯ���ϰ� ���ٸ� �ູ�� ��ȯ�Ѵ�.
 */

public class Store {
	private	int cost;
	private	int happiness;
	
	public Store(int cost, int happiness) {
		this.cost = cost;
		this.happiness = happiness;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getHappiness() {
		return happiness;
	}
	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}
}
