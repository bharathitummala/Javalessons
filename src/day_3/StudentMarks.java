package day_3;

public class StudentMarks {

	private float m1;
	private float m2;
	private float m3;
	private float m4;

	// Constructor
	// 1. Constructor is used to assign values to the global variable
	// 2. Constructor will have the same name of the class
	// 3. Constructor is a method without return type
	// 4. Constructor will be always public
	// 5. There can be zero or one or many constructor in a class

	private StudentMarks(float mar1, float mar2, float mar3, float mar4) {

		m1 = mar1;
		m2 = mar2;
		m3 = mar3;
		m4 = mar4;

	}

	private StudentMarks(float mar1, float mar2, float mar3) {

		m1 = mar1;
		m2 = mar2;
		m3 = mar3;
		m4 = 35;

	}

	private StudentMarks(float mar1, float mar2) {

		m1 = mar1;
		m2 = mar2;
		m3 = 35;
		m4 = 35;

	}

	public float calculateSum() {
		return m1 + m2 + m3 + m4;
	}

	public float calculateAvg() {
		return m1 + m2 + m3 + m4 / 4;
	}

	public static void main(String[] args) {

		StudentMarks s1 = new StudentMarks(25.6f, 78.6f, 87.f, 98.5f);
		System.out.println("Sum of the marks scored by student is : " + s1.calculateSum());
		System.out.println("Avg of the marks scored by student is : " + s1.calculateAvg());

		StudentMarks s2 = new StudentMarks(25.5f, 78.6f);
		System.out.println("Sum of the marks scored by student is : " + s2.calculateSum());
		System.out.println("Avg of the marks scored by student is : " + s2.calculateAvg());

		StudentMarks s3 = new StudentMarks(25.5f, 78.6f, 87.f);
		System.out.println("Sum of the marks scored by student is : " + s3.calculateSum());
		System.out.println("Avg of the marks scored by student is : " + s3.calculateAvg());
	}

}
