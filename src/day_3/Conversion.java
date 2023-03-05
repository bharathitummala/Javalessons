package day_3;

import java.util.Scanner;

public class Conversion {
	Scanner scan;
	int num;

	void getVal() {
		System.out.println("Decimal to HexaDecimal,Octal and Binary");
		scan = new Scanner(System.in);
		System.out.println("\nEnter the number :");
		// num = Integer.parseInt(scan.nextLine());
		num = scan.nextInt();
	}

	void convert() {
		String hexa = Integer.toHexString(num);
		System.out.println("HexaDecimal Value is : " + hexa);

		String octal = Integer.toOctalString(num);
		System.out.println("Octal Value is : " + octal);

		String binary = Integer.toBinaryString(num);
		System.out.println("Binary Value is : " + binary);
	}

	void DecimalToBinary(int number) {
		int tmp = number;
		String binary = "";
		while (number >= 2) {
			binary = number % 2 + binary;
			number = number / 2;
		}
		binary = number + binary;
		System.out.println("Binary of " + tmp + " is " + binary);
	}

	void DecimalToHexa(int number) {
		int tmp = number;
		tmp = number;
		String hexa = "";
		while (number >= 16) {
			hexa = getHexa(number % 16) + hexa;
			number = number / 16;
		}
		hexa = getHexa(number) + hexa;
		System.out.println("Hexadecimal of " + tmp + " is " + hexa);

	}

	static char getHexa(int n) {
		char[] nums = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		return nums[n];
	}

	public static String toOctal(int number) {
		int rem;
		String octal = "";
		char octalchars[] = { '0', '1', '2', '3', '4', '5', '6', '7' };
		while (number > 0) {
			rem = number % 8;
			octal = octalchars[rem] + octal;
			number = number / 8;

		}
		return octal;
	}

	public static void main(String args[]) {
		Conversion obj = new Conversion();
		obj.getVal();
		obj.convert();
		System.out.println("Class Functions");
		obj.DecimalToBinary(obj.num);
		obj.DecimalToHexa(obj.num);
		System.out.println("Decimal to octal of is: " + toOctal(obj.num));
	}

}