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
		System.out.println(LineNumber + "�� �°���"+ passengerCount + "���̰�, ������" + money + "�Դϴ�.");
	}
}

