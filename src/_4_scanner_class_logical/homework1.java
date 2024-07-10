package _4_scanner_class_logical;

import java.util.Scanner;

public class homework1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int no = sc.nextInt();
		int cube=(int) Math.pow(no, 3);
		System.out.println("Cube of number "+no+" is: " + cube);

	}

}
