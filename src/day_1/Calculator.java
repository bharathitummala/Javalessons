package day_1;

public class Calculator {

	int input1;
	int input2;
	// public <ReturnDataType> <NameOfTheMethod> (<inputs>){}

	public void additon(int input1, int input2) {

		int output = input1 + input2;

		System.out.println("added value is: " + output);

	}

	public int subtraction() {

		int output = input1 - input2;

		return output;

	}

	public int multiply() {

		int output = input1 * input2;

		return output;

	}

	public int divide() {

		int output = input1 / input2;

		return output;

	}

	public static void main(String[] args) {

		// object creation -- > objects are instances of class
		// Classname objname = new Classname();

		Calculator pocketCalculator = new Calculator();

		pocketCalculator.input1 = 100;
		pocketCalculator.input2 = 20;

		int sum = pocketCalculator.subtraction();

		System.out.println(sum);

//		Calculator addCalculator = new Calculator();
//		
//		pocketCalculator.input1 = 400;
//		pocketCalculator.input2 = 430;
//		

		pocketCalculator.additon(400, 430);
		pocketCalculator.additon(200, 430);

//		Calculator multiCalculator = new Calculator();

		pocketCalculator.input1 = 8;
		pocketCalculator.input2 = 6;

		int multiout = pocketCalculator.multiply();

		System.out.println("the value is " + multiout);

		Calculator dividCalculator = new Calculator();

		dividCalculator.input1 = 100;
		dividCalculator.input2 = 5;

		int dividout = dividCalculator.divide();

		System.out.println(dividout);

	}

}
