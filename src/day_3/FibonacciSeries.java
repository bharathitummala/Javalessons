package day_3;

public class FibonacciSeries {
	public int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String args[]) {
		FibonacciSeries findFib = new FibonacciSeries();
		System.out.println(findFib.fibonacci(9));
	}

}
