package leeSeungHoon;

public class Life {

	public static void main(String[] args) {
		Person leetoe = new Person(0, 0);
		Company noRang = new Company("Norang");
		Store chicken = new Store();

		for(int i = 0; (long)leetoe.happy < 1000; i++) {
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
