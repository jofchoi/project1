package gameLevel;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("���� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� Jump�մϴ�");
	}

	@Override
	public void turn() {
		System.out.println("Trun�� �� ������.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*****�ٱ��� �����Դϴ�.*****");
	}

}
