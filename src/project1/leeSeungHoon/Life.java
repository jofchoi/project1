package leeSeungHoon;

public class Life {

	public static void main(String[] args) {
		Person leetoe = new Person(0, 0);
		Company noRang = new Company("Norang");
		Store chicken = new Store();

		long workingDays = 10000;


		for(int i = 0; i <= workingDays; i++) {
			noRang.pay = 10;
			noRang.work(leetoe);
			chicken.buy(leetoe);

			i += i;
		}
		leetoe.showInfo();
		noRang.companyInfo();
		chicken.storeInfo();
	}

}
