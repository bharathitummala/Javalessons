package day_3;

public class PrimeNumber {

	public boolean checkPrimeNumber(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public void print30Primes() {
		int j = 2;
		int counter = 0;
		while (counter < 30) {
			if (checkPrimeNumber(j)) {
				System.out.println("The " + counter + " prime is " + j);
				counter++;
			}
			j++;

		}
	}

	public static void main(String[] args) {

		PrimeNumber check = new PrimeNumber();
		// System.out.println(check.checkPrimeNumber(13));
		check.print30Primes();

	}

}
