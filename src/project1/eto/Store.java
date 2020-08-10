package eto;
/**- Store 클래스 생성. 비용과 행복 멤버필드 추가. buy 메소드를 추가. 
  buy 메소드는 Person의 돈을 파라미터로 받고, 
     그 돈이 비용보다 많은지 확인하고 많다면 행복을 반환한다.
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
