package stuMarks;

public class SumMarks {

	public static void main(String[] args) {
		MarksCalc[] marksSum = new MarksCalc[4];
		marksSum[0] = new MarksCalc("Satish", 100, 5678);
		marksSum[1] = new MarksCalc("Roopa", 90, 6644);
		marksSum[2] = new MarksCalc("Jay", 90, 3333);
		marksSum[3] = new MarksCalc("Tej", 100, 5555);

		for (MarksCalc i : marksSum) {
			System.out.println("Students details are: " + i.studentName + " " + i.marks + " marks " + i.rollNo);

		}
		for (int i = 0; i < marksSum.length; i++) {
			System.out.println(
					"the values are:" + marksSum[i].studentName + " " + marksSum[i].marks + " " + marksSum[i].rollNo);

		}

		int[] sumMarks = { 10, 20, 30, 40, 50 };
		int sum = sumMarks[0] + sumMarks[1] + sumMarks[2] + sumMarks[3] + sumMarks[4];
		System.out.println(sum);
		int sumtotal = 0;
		for (int i = 0; i < sumMarks.length; i++) {
			sumtotal = sumtotal + sumMarks[i];
		}

		System.out.println("Total marks are: " + sumtotal);

	}

}
