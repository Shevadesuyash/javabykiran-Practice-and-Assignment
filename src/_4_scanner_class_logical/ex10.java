package _4_scanner_class_logical;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		System.out.println("Enter Side of Square:");
		Scanner sc = new Scanner(System.in);
		double side = sc.nextDouble();
		double area = side * side;
		System.out.println("Area of Square is: " + area);
	}
}
