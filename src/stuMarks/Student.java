
package stuMarks;

import java.util.Scanner;

public class Student {
	int english;
	int math;
	int art;
	int science;

	public void totalMarks() {
		int sum = english + math + art + science;
		System.out.println("Total Marks of student: " + sum);
	}

	public void avgMarks() {
		float avgCalc = (float) (english + math + art + science) / 4;
		System.out.println("Average marks: " + avgCalc);
	}

	public void assignMarks(int englishMarks, int mathMarks, int artMarks, int scienceMarks) {
		english = englishMarks;
		math = mathMarks;
		art = artMarks;
		science = scienceMarks;
	}

	public static void main(String[] args) {
		/*
		 * Student studentOne = new Student(); System.out.println("Student 1 Details");
		 * System.out.println("Ram"); studentOne.assignMarks(40, 34, 65, 35);
		 * studentOne.totalMarks(); studentOne.avgMarks(); System.out.println("");
		 * 
		 * Student studentTwo = new Student(); System.out.println("Student 2 Details");
		 * System.out.println("Lakshman"); studentTwo.assignMarks(34, 56, 78, 45);
		 * studentTwo.totalMarks(); studentTwo.avgMarks(); System.out.println("");
		 * 
		 * Student studentThree = new Student();
		 * System.out.println("Student 3 Details"); System.out.println("Dhruv");
		 * studentThree.assignMarks(45, 78, 67, 45); studentThree.totalMarks();
		 * studentThree.avgMarks(); System.out.println("");
		 * 
		 * Student studentFour = new Student(); System.out.println("Student 4 Details");
		 * System.out.println("Mohnish"); studentFour.assignMarks(65, 74, 34, 56);
		 * studentFour.totalMarks(); studentFour.avgMarks(); System.out.println("");
		 */
		System.out.print("\nNow let's scan the marks of another student? y/n: ");
		Scanner scanner = new Scanner(System.in);
		while (scanner.next().equalsIgnoreCase("y")) {
			System.out.print("Enter Name: ");
			String name = scanner.next();
			System.out.println("Enter Roll Number: ");
			int roll = scanner.nextInt();

			System.out.print("Enter English marks: ");
			int english = scanner.nextInt();
			System.out.print("Enter Math marks: ");
			int math = scanner.nextInt();
			System.out.print("Enter Art marks: ");
			int art = scanner.nextInt();
			System.out.print("Enter Science marks: ");
			int science = scanner.nextInt();

			System.out.println("Name : " + name);
			System.out.println("Roll : " + roll);
			Student studentFive = new Student();
			studentFive.assignMarks(english, math, art, science);
			studentFive.totalMarks();
			studentFive.avgMarks();

			System.out.print("Do you want to enter another student? y/n: ");
		}
		scanner.close();

		System.out.print("Exiting the program.. ");
	}

	public void calculateSum() {
		// TODO Auto-generated method stub

	}

}