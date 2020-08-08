package constructor;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public void setDay(int day) {
		if(month == 2) {
			if(day < 1 || day > 21) {
				System.out.println("Please fix the date");
			}	else {
				this.day = day;
			}
		}
	}
}
