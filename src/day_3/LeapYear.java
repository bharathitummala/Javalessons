package day_3;

public class LeapYear {

	public void printLeapYears() {
		for (int year = 2000; year <= 2100; year++) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println(year);
			}
		}
	}

	public static void main(String[] args) {
		LeapYear leapYear = new LeapYear();
		leapYear.printLeapYears();
	}

}
