package eto;
/**Company 클래스 생성. 일당 멤버필드 추가. 
 * - work 메소드 추가. work 메소드는 일당을 반환한다.
 * @author user
 *
 */
public class Company {
	private int dailyPay;

	public Company(int dailypay) {
		this.dailyPay = dailypay;
	}

	public int getDailyPay() {
		return dailyPay;
	}

	public void setDailyPay(int dailyPay) {
		this.dailyPay = dailyPay;
	}
	
}
