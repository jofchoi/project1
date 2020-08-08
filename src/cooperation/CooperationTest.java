package cooperation;

public class CooperationTest {

	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);

		Bus bbb = new Bus(100);
		studentJames.takeBus(bbb);
		studentJames.showInfo();
		bbb.showInfo();

		Subway subwayGreen = new Subway("2È£¼±");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
	}
}
