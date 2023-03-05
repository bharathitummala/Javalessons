package day_2;

public class EmployeeSalary {

	float base;
	float boa;
	float bonus;
	float pf = 0.12f;
	float yearlyGrossValue;

	public void monthlyTakeHomeSalary() {

		float monthlyGrossValue = (float) (base + boa + bonus) - pf * base;
		float yearlyGrossValue = monthlyGrossValue * 12;
		float taxrate = findYearlyTaxRateFromYearlyGrossValue(yearlyGrossValue);
		float yearlyTax = yearlyGrossValue * taxrate;
		float monthlyTax = yearlyTax / 12;
		float monthlyTakeHome = monthlyGrossValue - monthlyTax;
		System.out.println("Your Monthly take home is: " + monthlyTakeHome);

	}

	public float findYearlyTaxRateFromYearlyGrossValue(float yearlyGross) {

		if (yearlyGross <= 250000) {
			return 0;
		} else if (yearlyGross > 250000 && yearlyGross <= 500000) {
			return 0.05f;
		} else if (yearlyGross > 500000 && yearlyGross <= 750000) {
			return 0.2f;
		} else if (yearlyGross > 750000 && yearlyGross <= 1000000) {
			return 0.2f;
		} else if (yearlyGross > 1000000 && yearlyGross <= 1250000) {
			return 0.3f;
		} else if (yearlyGross > 1250000 && yearlyGross <= 1500000) {
			return 0.3f;
		} else {
			return 0.3f;
		}
	}

	public EmployeeSalary(float baseValue, float boaValue, float bonusValue) {

		base = baseValue;
		boa = boaValue;
		bonus = bonusValue;

	}

	public static void main(String[] args) {

		EmployeeSalary employeeOne = new EmployeeSalary(7000, 5000, 2000);
		employeeOne.monthlyTakeHomeSalary();

		EmployeeSalary employeeTwo = new EmployeeSalary(10000, 7000, 2500);
		employeeTwo.monthlyTakeHomeSalary();

		EmployeeSalary employeeThree = new EmployeeSalary(12000, 9000, 3000);
		employeeThree.monthlyTakeHomeSalary();

		EmployeeSalary employeeFour = new EmployeeSalary(15000, 10000, 3500);
		employeeFour.monthlyTakeHomeSalary();

		EmployeeSalary employeeFive = new EmployeeSalary(15000, 17000, 4000);
		employeeFive.monthlyTakeHomeSalary();

	}
}