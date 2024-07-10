package _4_scanner_class_logical;

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side: ");
		double side = sc.nextDouble();
		double area = side * side;
		System.out.println("Area of Square is: " + area);
	}
}
