package _2_class_method_calling;

public class homework3 {
	public static void main(String[] args) {
		double principal = 1000; 
		double rate = 5; 
		double time = 2; 
		int n = 4; 
		double compoundInterest = calculateCompoundInterest(principal, rate, time, n);
		System.out.println("The compound interest is " + compoundInterest);
	}

	public static double calculateCompoundInterest(double principal, double rate, double time, int n) {
		return principal * Math.pow((1 + rate / (n * 100)), n * time) - principal;
	}
}
