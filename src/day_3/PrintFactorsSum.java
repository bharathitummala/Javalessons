package day_3;

public class PrintFactorsSum {
	public void printFactors(int num) {
		int counter = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
				counter++;
			}
		}
		System.out.println("The total number of factors: " + counter);
	}

	public static void main(String[] args) {
		PrintFactorsSum printFactors = new PrintFactorsSum();
		printFactors.printFactors(10);

	}
}
