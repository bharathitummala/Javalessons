package Day3;

import java.util.Scanner;

public class Restaurant {
	static int Eat_Option = 0;
	static int Food_Deliver_Option;
	static String Food_Name = "";
	static double Food_Price;
	static int Menu_option;
	static int Menu_Qty;
	static double Amount;
	static String Order_More = "";
	static String Other_Category = "";

	static double Gst;
	static double Parceldinecharge;

	static double Totamt;

	static double NetBill;
	static double Discount;

	Scanner in = new Scanner(System.in);

	public void FoodDeliver() {
		System.out.println("1. Dine in");
		System.out.println("2. Take Away");
		System.out.println("Please Enter the option");

		Food_Deliver_Option = in.nextInt();

		if (Food_Deliver_Option == 1 || Food_Deliver_Option == 2) {
			return;
		}

		else {
			System.out.println("Enter Correct Option");
			FoodDeliver();
		}

	}

	public void MenuList() {

		if (Eat_Option == 0) {
			System.out.println("Please Select the category from the below list");
			System.out.println("1. Veg");
			System.out.println("2. Non Veg");
			Eat_Option = in.nextInt();

		}

		if (Eat_Option == 1) {
			VegList();
		}

		else if (Eat_Option == 2) {
			NonVegList();
		}

		else {
			System.out.println("Enter Correct Option");
			Scanner in = new Scanner(System.in);
			Eat_Option = in.nextInt();
			MenuList();
		}

	}

	public void VegList() {
		System.out.println("Available Dishes");
		System.out.println("1. Paneer Tikka - Rs.120 (per item)");
		System.out.println("2. Cashew Pulao - Rs.150 (per item)");
		System.out.println("3. Veg Fried Rice - Rs.130 (per item)");
		System.out.println("4. Gobi 65 - Rs.100 (per item)");
		System.out.println("5. Veg Thali - Rs.140 (per item)");
	}

	public void NonVegList() {

		System.out.println("Available Dishes");
		System.out.println("1. Chicken Biriyani - Rs.200 (per item)");
		System.out.println("2. Fish Curry - Rs.150 (per item)");
		System.out.println("3. Chicken 65 - Rs.120 (per item)");
		System.out.println("4. Mutton Gravy - Rs.220 (per item)");
		System.out.println("5. Chicken Fried Rice - Rs.180 (per item)");
	}

	public void MenuTake() {
		System.out.println("Please Enter the Option");
		Menu_option = in.nextInt();

		if (Eat_Option == 1) {

			switch (Menu_option) {
			case 1:
				Food_Name = "Paneer Tikka";
				Food_Price = 120.00;
				break;
			case 2:
				Food_Name = "Cashew Pulao";
				Food_Price = 150.00;
				break;
			case 3:
				Food_Name = "Veg Fried Rice";
				Food_Price = 130.00;
				break;
			case 4:
				Food_Name = "Gobi 65";
				Food_Price = 100.00;
				break;
			case 5:
				Food_Name = "Veg Thali";
				Food_Price = 140.00;
				break;
			default: {
				Food_Name = "";
				System.out.println("Invalid Option");
			}
			}
			in.close();
		}

		else if (Eat_Option == 2) {

			switch (Menu_option) {
			case 1:
				Food_Name = "Chicken Biriyani";
				Food_Price = 200.00;
				break;
			case 2:
				Food_Name = "Fish Curry";
				Food_Price = 150.00;
				break;
			case 3:
				Food_Name = "Chicken 65";
				Food_Price = 120.00;
				break;
			case 4:
				Food_Name = "Mutton Gravy";
				Food_Price = 220.00;
				break;
			case 5:
				Food_Name = "Chicken Fried Rice";
				Food_Price = 180.00;
				break;
			default: {
				Food_Name = "";
				System.out.println("Invalid Option");
			}
			}

		}

		MenuQuantity();
	}

	public void MenuQuantity() {
		System.out.println("Please enter number of " + Food_Name + " you would like to order - ");
		Menu_Qty = in.nextInt();

		Amount = Amount + (Menu_Qty * Food_Price);

		OrderMore();
	}

	public void OrderMore() {
		System.out.println("Would you like to order one more dish Y or N :");
		Order_More = in.next();

		if (Order_More.equals("Y") || Order_More.equals("y")) {
			MenuList();
			MenuTake();
		} else if (Order_More.equals("N") || Order_More.equals("n")) {
			System.out.println("Would you like to order from other category Y or N :");
			Other_Category = in.next();
			if (Other_Category.equals("Y") || Other_Category.equals("y")) {
				if (Eat_Option == 1) {
					Eat_Option = 2;
					NonVegList();
					MenuTake();

				} else if (Eat_Option == 2) {
					Eat_Option = 1;
					VegList();
					MenuTake();
				}

			} else if (Other_Category == "N" || Other_Category == "n") {
				TotalAmount();
			} else {
				TotalAmount();
			}
		} else {
			System.out.println("Enter Correct Option");
			OrderMore();
		}
	}

	public void TotalAmount() {

		Gst = Amount * 0.06;

		Parceldinecharge = 30.00;

		Totamt = Amount + Gst + Parceldinecharge;

		System.out.println("Total Cost " + Amount);
		System.out.println("Gst " + Gst);
		System.out.println("Parcel Charge " + Parceldinecharge);
		System.out.println("Total " + Totamt);

		if (Totamt > 1000.00) {
			Discount = Totamt * 0.1;
			System.out.println("Discount " + Discount);
			NetBill = Totamt - Discount;
			System.out.println("Net Bill Amount " + NetBill);
		} else {
			System.out.println("Net Bill Amount" + Totamt);
		}
		System.out.println("Thank You");

	}

	public static void main(String[] args) {
		Restaurant Res = new Restaurant();

		System.out.println("Welcome to Numpy Ninja Restaurant");
		System.out.println("Please Select the service below list");

		Res.FoodDeliver();
		Res.MenuList();
		Res.MenuTake();

	}

}