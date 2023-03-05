package day_3;

import java.util.Scanner;

public class WhileLoop {

	public void orderPizzas() {

		boolean canAcceptOrder = true;

		int numberofPizzas = 100;
		Scanner sc = new Scanner(System.in);

		while (canAcceptOrder) {

			System.out.println("i am selling pizzas..");

			System.out.println("Please enter your order...");
			int order = sc.nextInt();
			numberofPizzas = numberofPizzas - order;

			System.out.println(" number of available pizzas " + numberofPizzas);

			if (numberofPizzas <= 0) {
				canAcceptOrder = false;
			}

		}
		sc.close();

	}

	public static void main(String[] args) {
		WhileLoop orderpizzaOnline = new WhileLoop();
		orderpizzaOnline.orderPizzas();

	}

}
