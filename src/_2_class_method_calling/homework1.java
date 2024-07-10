package _2_class_method_calling;

public class homework1 {
	public static void main(String[] args) {
		int number = 3; 
		int cube = calculateCube(number);
		System.out.println("The cube of " + number + " is " + cube);
	}

	public static int calculateCube(int number) {
		return number * number * number;
	}
}
