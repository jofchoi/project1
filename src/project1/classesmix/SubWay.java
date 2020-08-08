package classesmix;

public class SubWay {
	String LineNumber;
	int passengerCount;
	int money;

	public SubWay(String LineNumber) {
		this.LineNumber = LineNumber;
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	} 

	public void showInfo() {
		System.out.println(LineNumber + "의 승객은"+ passengerCount + "명이고, 수입은" + money + "입니다.");
	}
}

