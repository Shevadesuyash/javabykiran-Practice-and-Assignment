package _2_class_method_calling;

public class homework4 {
	public static void main(String[] args) {
		int[] marks = { 85, 74, 90, 66, 58 }; // Example marks in 5 subjects
		String division = calculateDivision(marks);
		System.out.println("The student obtained " + division);
	}

	public static String calculateDivision(int[] marks) {
		int totalMarks = 0;
		for (int mark : marks) {
			totalMarks += mark;
		}
		double percentage = (double) totalMarks / marks.length;

		if (percentage >= 60) {
			return "First division";
		} else if (percentage >= 50) {
			return "Second division";
		} else if (percentage >= 40) {
			return "Third division";
		} else {
			return "Fail";
		}
	}
}
