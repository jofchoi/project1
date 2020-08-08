package leeSeungHoon;

public class Company {
	long pay;
	String company;
	long money;
	long workingDays;

	public Company(String company) {
		this.company = company;
	}

	public void work(Person person) {
			this.money -= pay;
			person.work(pay);
	}

	public void companyInfo() {
		System.out.println(money);
	}
}
