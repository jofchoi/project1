package Factory;
/**
 * 자료실 연관자료 없으면 문제를 못품
 * @author user
 *
 */
public class CarFactoryTest {
	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
	}
}
